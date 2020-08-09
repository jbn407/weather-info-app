package com.labs.weather.config;

import com.labs.weather.repository.CityRepository;
import com.labs.weather.repository.WeatherInfoRepository;
import com.labs.weather.service.Impl.StringUtilitiesServiceImpl;
import com.labs.weather.service.Impl.WeatherInfoServiceImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
/*
WeatherConfig is created to hold the beans to be used in the project.
 */
@Configuration
@EnableJpaRepositories(basePackages  = "com.labs.weather.repository")
@EntityScan(basePackages  = "com.labs.weather.model.dao")
@EnableTransactionManagement
public class WeatherConfig {
    @Bean
    StringUtilitiesServiceImpl stringUtilitiesServiceImpl() {
        return new StringUtilitiesServiceImpl();
    }
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
