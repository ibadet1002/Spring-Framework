package com.practice.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class configApp {

    @Bean
    fullTimeEmployee fullTimeEmployee(){
        return new fullTimeEmployee();
    }


    // @Bean(name = "p1"
    @Bean
    @Primary
    consultantEmployee consultantEmployee(){
        return new consultantEmployee();
    }

    // @Bean(name = "p2"
    @Bean
    consultantEmployee consultantEmployee2(){
        return new consultantEmployee();
    }

}
