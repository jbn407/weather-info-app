package com.labs.weather.service;

import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
/*
Interface to define method to save Weather Info to database
 */
public interface WeatherInfoService {
    Boolean persistWeatherInfo(String cityId, String token) throws URISyntaxException;
}
