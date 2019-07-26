package com.lethanh98.bean.CircularDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService  {
    private AService aService;
    private String name = "B";

    @Autowired
    public BService(AService aService) {
        this.aService = aService;
    }


    public String getName() {
        return name;
    }

    public AService getaService() {
        return aService;
    }

    public void setaService(AService aService) {
        this.aService = aService;
    }
}
