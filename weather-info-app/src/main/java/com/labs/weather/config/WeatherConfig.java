package com.labs.weather.config;

import com.labs.weather.repository.WeatherInfoRepository;
import com.labs.weather.service.Impl.StringUtilitiesServiceImpl;
import com.labs.weather.service.Impl.WeatherInfoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/*
WeatherConfig is created to hold the beans to be used in the project.
 */
@Configuration
public class WeatherConfig {
    @Bean
    StringUtilitiesServiceImpl stringUtilitiesServiceImpl() {
        return new StringUtilitiesServiceImpl();
    }
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    WeatherInfoServiceImpl weatherInfoServiceImpl() {
        return new WeatherInfoServiceImpl();
    }
    @Bean
    WeatherInfoRepository weatherInfoRepository() { return new WeatherInfoRepository();}
}
