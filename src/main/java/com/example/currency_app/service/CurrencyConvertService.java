package com.example.currency_app.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class CurrencyConvertService {

    private static final String API_KEY = "i2sUkA6UMa4NkPaRghMIr9TBjr5iQNzz";
    private static final String BASE_URL = "https://api.apilayer.com/currency_data/convert?from=USD&to=KZT&amount=1&date=2023-05-22";

    public Double convert(String from, String to, Double value) {
        HttpHeaders headers;
        try {
            if (value instanceof Double) {
                RestTemplate restTemplate = new RestTemplateBuilder().build();
                headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                headers.set("apikey", API_KEY);

                String response = restTemplate.getForObject(BASE_URL, String.class);
                System.out.println(response);
                return 1.2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 100.2;
    }
}
