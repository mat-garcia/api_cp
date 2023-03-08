package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResNotification {
    
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("data")
    private Data data;

    public ResNotification(String messageId, Data data){
        this.messageId = messageId;
        this.data = data;
    };

    //Getters and setters ;
    public String getMessageId(){
        return messageId;
    }
    public Data getData(){
        return data;
    }
}
