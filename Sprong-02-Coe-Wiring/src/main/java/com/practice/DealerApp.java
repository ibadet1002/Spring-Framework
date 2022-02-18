package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
    Car c = container.getBean(Car.class);
    Person p = container.getBean(Person.class);


}
