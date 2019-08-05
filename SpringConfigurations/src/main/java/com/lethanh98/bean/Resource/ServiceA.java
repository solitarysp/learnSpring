package com.lethanh98.bean.Resource;

import org.springframework.context.annotation.Bean;

public class ServiceA {
    private String name;

    public ServiceA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
