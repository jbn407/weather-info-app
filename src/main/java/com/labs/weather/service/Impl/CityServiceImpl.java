package com.labs.weather.service.Impl;

import com.labs.weather.model.dao.City;
import com.labs.weather.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CityServiceImpl {
    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Transactional
    public void saveData() {
        City city = new City();
        //city.setId(1);
        city.setCityId(12345);
        city.setCountryName("INDIA");

        cityRepository.save(city);
    }
}
