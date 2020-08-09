package com.labs.weather.controller;

import com.labs.weather.service.Impl.WeatherInfoServiceImpl;
import com.labs.weather.service.WeatherInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.net.URISyntaxException;
/*
Controller class to support the REST endpoint for WeatherInfo utilities.
 */
@RestController
@RequestMapping (value = "/weatherupdate")
public class WeatherController {
    private WeatherInfoServiceImpl weatherInfoServiceImpl;

    @Autowired
    public WeatherController(WeatherInfoServiceImpl weatherInfoServiceImpl) {
        this.weatherInfoServiceImpl = weatherInfoServiceImpl;
    }

    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);

    @PostMapping ("/city")
    public ResponseEntity<String> persistWeatherInfo(@RequestParam(name = "id") String cityId
            , @RequestParam(name = "appid") String token) throws URISyntaxException {
        if (weatherInfoServiceImpl.persistWeatherInfo(cityId, token)) {
            log.info("Inside Weather Controller");
            return new ResponseEntity<>("Weather Info is saved to Database.", HttpStatus.OK);
        }
        else {
            log.error("Saving Weather Info to Database has failed.");
            return new ResponseEntity<>("Saving Weather Info to database has failed.", HttpStatus.NOT_IMPLEMENTED);
        }
    }

}
