package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("name")
    private String name;
    @JsonProperty("legalCorporateName")
    private String legalCorporateName;
    @JsonProperty("taxpayerIdentificationNumber")
    private String taxpayerIdentificationNumber;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("agencyCode")
    private String agencyCode;
    @JsonProperty("costCenter")
    private CostCenter costCenter;

    public Customer(String name, String legalCorporateName, String taxpayerIdentificationNumber, Address address, String agencyCode, CostCenter costCenter) {
        this.name = name;
        this.legalCorporateName = legalCorporateName;
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
        this.address = address;
        this.agencyCode = agencyCode;
        this.costCenter = costCenter;
    }

    public String getName() {
        return name;
    }

    public String getLegalCorporateName() {
        return legalCorporateName;
    }

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public CostCenter getCostCenter() {
        return costCenter;
    }
}
