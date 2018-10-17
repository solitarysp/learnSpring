package com.higgsup.Conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.higgsup.Conditional")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
