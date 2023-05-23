package com.example.currency_app;

import com.example.currency_app.controller.MainBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyAppApplication {

    public static void main(String[] args) {
//        MainBot.start();
        SpringApplication.run(CurrencyAppApplication.class, args);
    }
}
