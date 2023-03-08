package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("addressLine")
    private String addressLine;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("location")
    private Location location;

    public Address(String addressLine, String zipCode, Location location) {
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.location = location;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Location getLocation() {
        return location;
    }
}
