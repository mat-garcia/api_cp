package com.cpconnect.api.jobIntegracao.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Rules {
    @JsonProperty("cancelPolicy")
    private Integer cancelPolicy;
    @JsonProperty("cancelPolicyAbsoluteDeadline")
    private String cancelPolicyAbsoluteDeadline;
    @JsonProperty("noShow")
    private String noShow;
    @JsonProperty("noShowDate")
    private String noShowDate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("allowPet")
    private Boolean allowPet;
    @JsonProperty("mealPlan")
    private String mealPlan;
    @JsonProperty("prePayment")
    private PrePayment prePayment;
    @JsonProperty("commission")
    private Commission commission;

    public Rules(Integer cancelPolicy, String cancelPolicyAbsoluteDeadline, String noShow, String noShowDate, String description, Boolean allowPet, String mealPlan, PrePayment prePayment, Commission commission) {
        this.cancelPolicy = cancelPolicy;
        this.cancelPolicyAbsoluteDeadline = cancelPolicyAbsoluteDeadline;
        this.noShow = noShow;
        this.noShowDate = noShowDate;
        this.description = description;
        this.allowPet = allowPet;
        this.mealPlan = mealPlan;
        this.prePayment = prePayment;
        this.commission = commission;
    }

    //Getters and setters


    public Integer getCancelPolicy() {
        return cancelPolicy;
    }

    public String getCancelPolicyAbsoluteDeadline() {
        return cancelPolicyAbsoluteDeadline;
    }

    public String getNoShow() {
        return noShow;
    }

    public String getNoShowDate() {
        return noShowDate;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAllowPet() {
        return allowPet;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public PrePayment getPrePayment() {
        return prePayment;
    }

    public Commission getCommission() {
        return commission;
    }
}
