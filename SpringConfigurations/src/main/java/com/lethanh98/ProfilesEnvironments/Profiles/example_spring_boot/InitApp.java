package com.lethanh98.ProfilesEnvironments.Profiles.example_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApp {
    public static void main(String[] args) {
       // System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
        SpringApplication.run(InitApp.class, args);
    }
}
