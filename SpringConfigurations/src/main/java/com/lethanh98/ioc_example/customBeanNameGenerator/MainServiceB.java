package com.lethanh98.ioc_example.customBeanNameGenerator;

import org.springframework.stereotype.Service;

@Service
public class MainServiceB {
    public MainServiceB() {
        System.out.println("MainServiceB");
    }
}
