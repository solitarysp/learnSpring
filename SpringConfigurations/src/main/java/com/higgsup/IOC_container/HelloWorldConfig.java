package com.higgsup.IOC_container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean("hello")
    public Object helloWorld(){
        return "hello he he";
    }
}
