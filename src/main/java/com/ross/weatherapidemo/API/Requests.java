package com.ross.weatherapidemo.API;

import org.springframework.stereotype.Service;

@Service
public class Requests {

    private String currentWeather = "current.json?";
    private String forecast = "forecast.json?";
    private String history = "history.json?";
    private String marine = "marine.json?";
    private String future = "future.json?";
    private String timeZone = "timezone.json?";
    private String sports = "sports.json?";


    public Requests() {

    }

    public String getCurrentWeather() {
        return currentWeather;
    }

    public String getForecast() {
        return forecast;
    }

    public String getHistory() {
        return history;
    }

    public String getMarine() {
        return marine;
    }

    public String getFuture() {
        return future;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getSports() {
        return sports;
    }
}
