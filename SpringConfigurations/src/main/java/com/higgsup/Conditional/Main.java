package com.higgsup.Conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.higgsup.Conditional")
@PropertySource("classpath:Environment2.properties")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
