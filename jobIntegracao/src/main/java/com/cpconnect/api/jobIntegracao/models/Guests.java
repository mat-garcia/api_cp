package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guests {
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("ageQualifying")
    private String ageQualifying;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("age")
    private Integer age;

    public Guests(String name, String surname, String ageQualifying, String email, String phone, Integer age) {
        this.name = name;
        this.surname = surname;
        this.ageQualifying = ageQualifying;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAgeQualifying() {
        return ageQualifying;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }
}
