package com.paquetecontable.main;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Version version(){
        return new Version( 1, 0, 0);
    }
}
