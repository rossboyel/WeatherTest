package com.ross.weatherapidemo.controllers;

import com.ross.weatherapidemo.api.APIClient;
import com.ross.weatherapidemo.weatherdata.CurrentWeather;
import com.ross.weatherapidemo.json.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    private final APIClient apiClient;
    private final JsonParser jsonParser;

    @Autowired
    public WeatherController(APIClient apiClient, JsonParser jsonParser) {
        this.apiClient = apiClient;
        this.jsonParser = jsonParser;
    }

    @GetMapping("/home")
    public String showHome() {
        return "home.html";
    }

    @PostMapping("/process-form")
    @ResponseBody
    public ResponseEntity<CurrentWeather> processForm(@RequestParam("endpoint") String selectedEndpoint,
                                              @RequestParam("location") String location) {
        String jsonResponse = apiClient.sendRequest(selectedEndpoint, location);

        CurrentWeather currentWeather = jsonParser.parseCurrentWeather(jsonResponse);
        System.out.println(currentWeather.getHumidity());
        if (currentWeather != null) {
            return ResponseEntity.ok(currentWeather);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
