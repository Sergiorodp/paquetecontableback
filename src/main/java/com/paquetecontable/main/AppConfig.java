package com.paquetecontable.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Version version(){
        return new Version( 1, 0, 0);
    }
}
