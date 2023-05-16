package com.ross.weatherapidemo.API;

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

    private Requests requests;



    public APIClient(Requests requests) {
        this.requests = requests;
    }

    public void getCurrentWeather(String location) {
        System.out.println(getApiKey());
        System.out.println(apiKey);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(getBasePath() + requests.getCurrentWeather() + getApiKey() + "q=" + location))
                .GET()
                .build();
        System.out.println(request);

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String responseBody = response.body();

            System.out.println("Response Status Code: " + statusCode);
            System.out.println("Response Body: " + responseBody);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getApiKey() {
        return "key=" + apiKey + "&";
    }

    public String getBasePath() {
        return basePath;
    }
}
