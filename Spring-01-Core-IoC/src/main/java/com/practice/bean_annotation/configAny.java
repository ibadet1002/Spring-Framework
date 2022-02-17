package com.practice.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configAny {
    @Bean
    String str(){
        return "developer";
    }

    @Bean
    Integer number(){
        return 123;
    }
}
