package com.labs.weather.model.dto;

import java.util.Date;
/*
Data Transfer Object for errors occurred while using Weather Info API.
 */
public class ErrorWrapperDto {
    private String message;
    private Date timeStamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
