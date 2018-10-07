package com.higgsup.example_config.annotation.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class LogicCreateBean {
    @Bean("catService")
    public CatService getCatService() {
        CatService catService = new CatService();
        System.out.println("new cat service");
        return catService;
    }
}
