package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GuestCounts {
    @JsonProperty("ageQualifying")
    private String ageQualifying;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("age")
    private Integer age;

    public GuestCounts(String ageQualifying, Integer count, Integer age) {
        this.ageQualifying = ageQualifying;
        this.count = count;
        this.age = age;
    }

    public String getAgeQualifying() {
        return ageQualifying;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getAge() {
        return age;
    }
}
