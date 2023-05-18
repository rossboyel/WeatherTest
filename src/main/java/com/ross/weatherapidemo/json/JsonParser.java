package com.ross.weatherapidemo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ross.weatherapidemo.weatherdata.CurrentWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonParser {

    private final ObjectMapper objectMapper;

    @Autowired
    public JsonParser(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    /**
     * Get the current weather from JSON. Creates a CurrentWeather object and parses the data from the JSON into
     * the object.
     * @param json the returned JSON file from the API
     * @return A CurrentWeather object
     */
    public CurrentWeather parseCurrentWeather(String json) {
        CurrentWeather currentWeather = new CurrentWeather();
        try {
            JsonNode rootNode = objectMapper.readTree(json);
            JsonNode currentWeatherNode = rootNode.get("current");

            currentWeather = objectMapper.treeToValue(currentWeatherNode, CurrentWeather.class);
            return currentWeather;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return currentWeather;
    }
}
