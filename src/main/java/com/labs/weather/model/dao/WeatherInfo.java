package com.labs.weather.model.dao;

import javax.persistence.*;
import java.time.LocalDateTime;
/*
Entity object to hold Weather Information. Weather Information is saved to Database from this object.
 */
@Entity
@Table(name = "weatherinfo")
public class WeatherInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "main")
    private String main;
    @Column(name = "weather_description")
    private String weatherDescription;
    @Column(name = "temp")
    private Double temp;
    @Column(name = "temp_min")
    private Double tempMin;
    @Column(name = "temp_max")
    private Double tempMax;
    @Column(name = "pressure")
    private Integer pressure;
    @Column(name = "humidity")
    private Integer humidity;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

}
