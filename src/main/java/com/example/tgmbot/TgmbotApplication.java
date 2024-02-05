package com.example.tgmbot;

import com.example.tgmbot.config.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class TgmbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TgmbotApplication.class, args);
    }

}
