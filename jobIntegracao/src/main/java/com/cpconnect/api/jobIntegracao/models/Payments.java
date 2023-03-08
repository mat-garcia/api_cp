package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payments {
    @JsonProperty("type")
    private String type;
    @JsonProperty("billing")
    private Object billing;

    public Payments(String type, Object billing) {
        this.type = type;
        this.billing = billing;
    }

    public String getType() {
        return type;
    }

    public Object getBilling() {
        return billing;
    }
}
