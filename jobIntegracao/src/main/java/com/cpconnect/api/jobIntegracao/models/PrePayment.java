package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrePayment {
    @JsonProperty("paymentPolicyEvent")
    private String paymentPolicyEvent;
    @JsonProperty("hoursVariation")
    private Integer hoursVariation;
    @JsonProperty("valueCondition")
    private ValueCondition valueCondition;

    public PrePayment(String paymentPolicyEvent, Integer hoursVariation, ValueCondition valueCondition) {
        this.paymentPolicyEvent = paymentPolicyEvent;
        this.hoursVariation = hoursVariation;
        this.valueCondition = valueCondition;
    }

    public String getPaymentPolicyEvent() {
        return paymentPolicyEvent;
    }

    public Integer getHoursVariation() {
        return hoursVariation;
    }

    public ValueCondition getValueCondition() {
        return valueCondition;
    }
}
