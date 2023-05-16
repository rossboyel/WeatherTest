package com.ross.weatherapidemo.weatherdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather  {

    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("temp_c")
    private double temperatureCelsius;
    @JsonProperty("temp_f")
    private double temperatureFahrenheit;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("wind_mph")
    private double windMph;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("wind_dir")
    private String windDirection;
    @JsonProperty("pressure_mb")
    private double pressureMb;
    @JsonProperty("pressure_in")
    private double pressureIn;
    @JsonProperty("precip_mm")
    private double precipitationMm;
    @JsonProperty("precip_in")
    private double precipitationIn;
    private int humidity;
    private int cloud;
    @JsonProperty("feelslike_c")
    private double feelsLikeCelsius;
    @JsonProperty("feelslike_f")
    private double feelsLikeFahrenheit;
    @JsonProperty("vis_km")
    private double visibilityKm;
    @JsonProperty("vis_miles")
    private double visibilityMiles;
    private double uv;
    @JsonProperty("gust_mph")
    private double windGustMph;
    @JsonProperty("gust_kph")
    private double windGustKph;

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getPrecipitationMm() {
        return precipitationMm;
    }

    public void setPrecipitationMm(double precipitationMm) {
        this.precipitationMm = precipitationMm;
    }

    public double getPrecipitationIn() {
        return precipitationIn;
    }

    public void setPrecipitationIn(double precipitationIn) {
        this.precipitationIn = precipitationIn;
    }

    public double getFeelsLikeCelsius() {
        return feelsLikeCelsius;
    }

    public void setFeelsLikeCelsius(double feelsLikeCelsius) {
        this.feelsLikeCelsius = feelsLikeCelsius;
    }

    public double getFeelsLikeFahrenheit() {
        return feelsLikeFahrenheit;
    }

    public void setFeelsLikeFahrenheit(double feelsLikeFahrenheit) {
        this.feelsLikeFahrenheit = feelsLikeFahrenheit;
    }

    public double getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(double visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public double getVisibilityMiles() {
        return visibilityMiles;
    }

    public void setVisibilityMiles(double visibilityMiles) {
        this.visibilityMiles = visibilityMiles;
    }

    public double getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(double windGustMph) {
        this.windGustMph = windGustMph;
    }

    public double getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(double windGustKph) {
        this.windGustKph = windGustKph;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }


    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }



    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", temperatureCelsius=" + temperatureCelsius +
                ", temperatureFahrenheit=" + temperatureFahrenheit +
                ", isDay=" + isDay +
                ", windMph=" + windMph +
                ", windDegree=" + windDegree +
                ", windDirection='" + windDirection + '\'' +
                ", pressureMb=" + pressureMb +
                ", pressureIn=" + pressureIn +
                ", precipitationMm=" + precipitationMm +
                ", precipitationIn=" + precipitationIn +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelsLikeCelsius=" + feelsLikeCelsius +
                ", feelsLikeFahrenheit=" + feelsLikeFahrenheit +
                ", visibilityKm=" + visibilityKm +
                ", visibilityMiles=" + visibilityMiles +
                ", uv=" + uv +
                ", windGustMph=" + windGustMph +
                ", windGustKph=" + windGustKph +
                '}';
    }
}