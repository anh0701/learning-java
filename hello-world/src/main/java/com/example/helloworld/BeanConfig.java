package com.example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfig {
    @Bean
    public Map<Integer, NameModel> NameServiceBean(){
        return new HashMap<>();
    }
}
