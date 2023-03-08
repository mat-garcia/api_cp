package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
    @JsonProperty("hotelPMSId")
    private String hotelPMSId;
    @JsonProperty("hotelB2BId")
    private String hotelB2BId;

    public Property(String hotelPMSId, String hotelB2BId) {
        this.hotelPMSId = hotelPMSId;
        this.hotelB2BId = hotelB2BId;
    }

    public String getHotelPMSId() {
        return hotelPMSId;
    }

    public String getHotelB2BId() {
        return hotelB2BId;
    }
}
