package com.bootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main App java class to start Spring Boot
 */

@SpringBootApplication
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class, args);
    }


}
