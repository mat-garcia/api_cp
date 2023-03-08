package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Commission {

    @JsonProperty("valueByDailyRate")
private Double valueByDailyRate;
    @JsonProperty("valueByBooking")
private Double valueByBooking;
    @JsonProperty("valuePerc")
private Double valuePerc;

    public Commission(Double valueByDailyRate, Double valueByBooking, Double valuePerc) {
        this.valueByDailyRate = valueByDailyRate;
        this.valueByBooking = valueByBooking;
        this.valuePerc = valuePerc;
    }

    public Double getValueByDailyRate() {
        return valueByDailyRate;
    }

    public Double getValueByBooking() {
        return valueByBooking;
    }

    public Double getValuePerc() {
        return valuePerc;
    }
}
