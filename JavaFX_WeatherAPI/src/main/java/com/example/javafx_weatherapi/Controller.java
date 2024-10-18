package com.example.javafx_weatherapi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Controller
{

    @FXML
    private TextField cityInput;

    @FXML
    private Button getWeatherButton;

    @FXML
    private Label weatherLabel;

    private static final String API_KEY = "";

    @FXML
    protected void onGetWeatherButtonClick()
    {
        String cityName = cityInput.getText();
        String weatherData = fetchWeather(cityName);
        weatherLabel.setText(weatherData);
    }

    private String fetchWeather(String cityName)
    {
        String apiUrl = String.format(
                "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric",
                cityName, API_KEY);

        try
        {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200)
            {
                JSONParser parser = new JSONParser();
                JSONObject jsonResponse = (JSONObject) parser.parse(response.body());

                if (jsonResponse.get("main") != null)
                {
                    JSONObject main = (JSONObject) jsonResponse.get("main");
                    double temperature = (double) main.get("temp");
                    return "Temperature in " + cityName + ": " + temperature + "°C";
                }
                else
                {
                    return "Error: City not found!";
                }

            }
            else
            {
                return "Error: API request failed! (HTTP Status: " + response.statusCode() + ")";
            }

        } catch (Exception e)
        {
            return "Error: Could not connect to the weather service.";
        }
    }
}
