package com.labs.weather.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/*
This is the main application class to run the project.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.labs.weather.*")
public class WeatherInfoMain {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WeatherInfoMain.class, args);
    }
}
