package com.ross.weatherapidemo;

import com.ross.weatherapidemo.API.APIClient;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class WeatherApiDemoApplication {

    private final APIClient weatherAPIClient;

    @Autowired
    public WeatherApiDemoApplication(APIClient weatherAPIClient) {
        this.weatherAPIClient = weatherAPIClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(WeatherApiDemoApplication.class, args);
    }

    @PostConstruct
    public void requestLocation() throws IOException {
        System.out.println("Please enter the location:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String location = bufferedReader.readLine();

        weatherAPIClient.getCurrentWeather(location);
    }

}
