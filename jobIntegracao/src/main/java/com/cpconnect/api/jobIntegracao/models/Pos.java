package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pos {
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("email")
    private String email;
    @JsonProperty("taxpayerIdentificationNumber")
    private String taxpayerIdentificationNumber;
    @JsonProperty("agencyCode")
    private String agencyCode;
    @JsonProperty("phone")
    private String phone;

    public Pos(String name, Address address, String email, String taxpayerIdentificationNumber, String agencyCode, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
        this.agencyCode = agencyCode;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public String getPhone() {
        return phone;
    }
}
