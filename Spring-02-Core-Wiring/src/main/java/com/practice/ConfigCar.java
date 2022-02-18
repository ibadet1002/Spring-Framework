package com.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

/*
    @Direct wiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());
        return p;
    }

 */


    @Autowired
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;
    }
}


