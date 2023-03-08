package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CostCenter {
    @JsonProperty("value")
    private String value;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("agencyCode")
    private String agencyCode;

    public CostCenter(String value, Integer id, String agencyCode) {
        this.value = value;
        this.id = id;
        this.agencyCode = agencyCode;
    }

    public String getValue() {
        return value;
    }

    public Integer getId() {
        return id;
    }

    public String getAgencyCode() {
        return agencyCode;
    }
}
