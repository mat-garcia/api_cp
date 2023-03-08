package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Total {
    @JsonProperty("taxes")
    private List<Taxes> taxes;
    @JsonProperty("amountBeforeTax")
    private Double amountBeforeTax;
    @JsonProperty("amountTax")
    private Double amountTax;
    @JsonProperty("amountAfterTax")
    private Double amountAfterTax;
    @JsonProperty("currencyCode")
    private String currencyCode;


    public Total(List<Taxes> taxes, Double amountBeforeTax, Double amountTax, Double amountAfterTax, String currencyCode) {
        this.taxes = taxes;
        this.amountBeforeTax = amountBeforeTax;
        this.amountTax = amountTax;
        this.amountAfterTax = amountAfterTax;
        this.currencyCode = currencyCode;
    }

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public Double getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public Double getAmountTax() {
        return amountTax;
    }

    public Double getAmountAfterTax() {
        return amountAfterTax;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
