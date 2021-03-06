package com.lethanh98.bean.CircularDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class AService{
    @Autowired
    BService bService;
    private String name = "A";

    public AService() {
    }

    public AService(BService bService) {
        this.bService = bService;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BService getbService() {
        return bService;
    }

    public void setbService(BService bService) {
        this.bService = bService;
    }
}
