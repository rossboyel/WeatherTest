package com.ross.weatherapidemo.weatherdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalTime;


public class Location {

    private String location;
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    @JsonProperty("tz_id")
    private String tzID;
    private LocalTime localTime;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTzID() {
        return tzID;
    }

    public void setTzID(String tzID) {
        this.tzID = tzID;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return "Location{" +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tzID='" + tzID + '\'' +
                ", localTime=" + localTime +
                '}';
    }
}
