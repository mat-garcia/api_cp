package com.cpconnect.api.jobIntegracao.models;

public class Location {
    private String cityName;
    private String cityCode;
    private String stateName;

    public Location(String cityName, String cityCode, String stateName) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getStateName() {
        return stateName;
    }
}
