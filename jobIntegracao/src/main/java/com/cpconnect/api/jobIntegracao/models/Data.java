package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    private String timestamp;
    private Booking booking;

    public Data(String timestamp, Booking booking){
        this.booking = booking;
        this.timestamp = timestamp;
    }
    //Getters and setters
    @JsonProperty("timestamp")
    public String getTimestamp(){
        return timestamp;
    }
    @JsonProperty("booking")
    public Booking getBooking(){
        return booking;
    }

}
