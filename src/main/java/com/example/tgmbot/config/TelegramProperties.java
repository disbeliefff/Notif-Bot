package com.example.tgmbot.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bot")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramProperties {
    String url;
    String name;
    String token;
}
