package com.example.springapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDriver {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigurationDriver.class);
        context.refresh();
        System.out.println(context.getBean(ConfigurationDriver.class));
    }
}
