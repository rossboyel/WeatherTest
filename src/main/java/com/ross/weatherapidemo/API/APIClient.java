package com.ross.weatherapidemo.api;


import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class APIClient {

    @Value("${api.key}")
    private String apiKey;

    private final String basePath = "https://api.weatherapi.com/v1/";

    public String sendRequest(String endpoint, String location) {
        System.out.println(getApiKey());
        System.out.println(apiKey);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(getBasePath() + endpoint + "key=" + getApiKey() + "&q=" + location))
                .GET()
                .build();
        System.out.println(request);

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String responseBody = response.body();

            System.out.println("Response Status Code: " + statusCode);
            System.out.println("Response Body: " + responseBody);

            if(statusCode == HttpStatus.SC_OK) {
                return responseBody;
            } else {
                return "Error: " + statusCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error, check trace";
        }
    }

    public String getBasePath() {
        return basePath;
    }

    public String getApiKey() {
        return apiKey;
    }
}
