package com.cpconnect.api.jobIntegracao.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Rates {
    @JsonProperty("ratePlanPMSId")
    private String ratePlanPMSId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("amountBeforeTax")
    private Integer amountBeforeTax;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("occupancy")
    private String occupancy;
    @JsonProperty("periods")
    private List<Periods> periods;


    public Rates(String ratePlanPMSId, String name, Integer amountBeforeTax, String currencyCode, String occupancy, List<Periods> periods) {
        this.ratePlanPMSId = ratePlanPMSId;
        this.name = name;
        this.amountBeforeTax = amountBeforeTax;
        this.currencyCode = currencyCode;
        this.occupancy = occupancy;
        this.periods = periods;
    }

    public String getRatePlanPMSId() {
        return ratePlanPMSId;
    }

    public String getName() {
        return name;
    }

    public Integer getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public List<Periods> getPeriods() {
        return periods;
    }
}
