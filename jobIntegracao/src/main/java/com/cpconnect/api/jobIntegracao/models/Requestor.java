package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Requestor {
    @JsonProperty("pos")
    private Pos pos;
    @JsonProperty("agency")
    private Agency agency;
    @JsonProperty("channelReservationNumber")
    private String channelReservationNumber;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("locator")
    private String locator;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("confirmation")
    private String confirmation;

    public Requestor(Pos pos, Agency agency, String channelReservationNumber, String channel, String locator, String comments, String confirmation) {
        this.pos = pos;
        this.agency = agency;
        this.channelReservationNumber = channelReservationNumber;
        this.channel = channel;
        this.locator = locator;
        this.comments = comments;
        this.confirmation = confirmation;
    }

    public Pos getPos() {
        return pos;
    }

    public Agency getAgency() {
        return agency;
    }

    public String getChannelReservationNumber() {
        return channelReservationNumber;
    }

    public String getChannel() {
        return channel;
    }

    public String getLocator() {
        return locator;
    }

    public String getComments() {
        return comments;
    }

    public String getConfirmation() {
        return confirmation;
    }
}
