package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agency {
    @JsonProperty("agencyCompanyId")
    private String agencyCompanyId;
    @JsonProperty("agencyChainCompanyId")
    private String agencyChainCompanyId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameChain")
    private String nameChain;

    public Agency(String agencyCompanyId, String agencyChainCompanyId, String name, String nameChain) {
        this.agencyCompanyId = agencyCompanyId;
        this.agencyChainCompanyId = agencyChainCompanyId;
        this.name = name;
        this.nameChain = nameChain;
    }

    public String getAgencyCompanyId() {
        return agencyCompanyId;
    }

    public String getAgencyChainCompanyId() {
        return agencyChainCompanyId;
    }

    public String getName() {
        return name;
    }

    public String getNameChain() {
        return nameChain;
    }
}
