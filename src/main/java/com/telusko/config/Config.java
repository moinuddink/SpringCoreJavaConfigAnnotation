package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.telusko"})
public class Config {

    public Config() {
        System.out.println("Config bean created");
    }

    @Bean
    public Password createPasswordObj()
    {
        Password pass = new Password();
        return pass;
    }
}
