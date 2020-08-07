package com.labs.weather.repository;

import com.labs.weather.model.dao.WeatherInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/*
Repository class to save weather information to database.
 */
@Repository
public class WeatherInfoRepository implements CrudRepository<WeatherInfo, String> {

    @Override
    public <S extends WeatherInfo> S save(S s) {
        return s;
    }

    @Override
    public <S extends WeatherInfo> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<WeatherInfo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<WeatherInfo> findAll() {
        return null;
    }

    @Override
    public Iterable<WeatherInfo> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(WeatherInfo weatherInfo) {

    }

    @Override
    public void deleteAll(Iterable<? extends WeatherInfo> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
