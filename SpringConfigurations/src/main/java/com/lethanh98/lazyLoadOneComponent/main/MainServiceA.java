package com.lethanh98.lazyLoadOneComponent.main;

import org.springframework.stereotype.Service;

@Service
public class MainServiceA {
    public MainServiceA() {
        System.out.println("MainServiceA");
    }
}
