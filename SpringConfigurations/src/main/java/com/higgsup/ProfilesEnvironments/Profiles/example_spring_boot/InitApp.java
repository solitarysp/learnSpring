package com.higgsup.ProfilesEnvironments.Profiles.example_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class InitApp {
    public static void main(String[] args) {
       // System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
        SpringApplication.run(InitApp.class, args);
    }
}
