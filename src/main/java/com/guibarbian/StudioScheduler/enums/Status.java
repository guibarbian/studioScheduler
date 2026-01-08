package com.guibarbian.StudioScheduler.enums;

public enum Status {
    
    SCHEDULED("Scheduled"),

    CONCLUED("Conclued"),

    CANCELED("Canceled");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
