package com.labs.weather.controller;

import com.labs.weather.service.Impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weatherupdate")
public class CityController {

    private CityServiceImpl cityServiceImpl;

    @Autowired
    public CityController(CityServiceImpl cityServiceImpl) {
        this.cityServiceImpl = cityServiceImpl;
    }

    @PostMapping("/save")
    public ResponseEntity<String> savedata() {
        cityServiceImpl.saveData();
        return new ResponseEntity<String>("success", HttpStatus.OK);

    }
}
