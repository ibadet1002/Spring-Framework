package com.practice.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configApp {

    @Bean
    fullTimeEmployee fullTimeEmployee(){
        return new fullTimeEmployee();
    }

    @Bean
    consultantEmployee consultantEmployee(){
        return new consultantEmployee();
    }

}
