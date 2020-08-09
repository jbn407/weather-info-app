package com.labs.weather.repository;

import com.labs.weather.model.dao.WeatherInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
Repository class to save weather information to database.
 */
@Repository
public interface WeatherInfoRepository extends CrudRepository<WeatherInfo, Integer> {
}
