package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueCondition {
    @JsonProperty("roomNights")
    private Integer roomNights;
    @JsonProperty("bookingTotalValue")
    private Boolean bookingTotalValue;
    @JsonProperty("bookingTotalPerc")
    private Double bookingTotalPerc;

    public ValueCondition(Integer roomNights, Boolean bookingTotalValue, Double bookingTotalPerc) {
        this.roomNights = roomNights;
        this.bookingTotalValue = bookingTotalValue;
        this.bookingTotalPerc = bookingTotalPerc;
    }

    public Integer getRoomNights() {
        return roomNights;
    }

    public Boolean getBookingTotalValue() {
        return bookingTotalValue;
    }

    public Double getBookingTotalPerc() {
        return bookingTotalPerc;
    }
}

