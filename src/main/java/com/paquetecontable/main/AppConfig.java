package com.paquetecontable.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Version version(){
        return new Version( 1, 0, 0);
    }

    @Bean
    public RestTemplate restTemplae(){
        return new RestTemplate();
    }
}
