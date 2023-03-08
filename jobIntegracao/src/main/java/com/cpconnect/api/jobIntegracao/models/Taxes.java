package com.cpconnect.api.jobIntegracao.models;

public class Taxes {
    private String name;
    private String comments;
    private Double amount;
    private Double perc;

    public Taxes(String name, String comments, Double amount, Double perc) {
        this.name = name;
        this.comments = comments;
        this.amount = amount;
        this.perc = perc;
    }

    public String getName() {
        return name;
    }

    public String getComments() {
        return comments;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getPerc() {
        return perc;
    }
}
