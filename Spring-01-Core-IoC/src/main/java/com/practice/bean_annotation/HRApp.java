package com.practice.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class HRApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(
                configApp.class, configAny.class);

        fullTimeEmployee ft = container.getBean(fullTimeEmployee.class);
       ft.createAccount();


        consultantEmployee ct = container.getBean(consultantEmployee.class);
        ct.createAccount();



      String str = container.getBean(String.class);
        System.out.println(str);
    }
}
