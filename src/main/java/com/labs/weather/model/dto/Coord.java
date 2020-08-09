package com.labs.weather.model.dto;
/*
Data Transfer Object for Co-ordinates information per one Weather update record.
 */
public class Coord {
    private Double lon;
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
