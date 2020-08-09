package com.labs.weather.model.exception;
/*
Customised Exception to represent Service unavailability of Weather Info API
 */
public class ServiceUnavailableException extends RuntimeException {

    public ServiceUnavailableException(String message) { super(message);}
}
