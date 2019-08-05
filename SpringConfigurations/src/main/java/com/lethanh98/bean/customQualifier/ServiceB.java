package com.lethanh98.bean.customQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }

    @Autowired
    public void setServiceA(@Genre("ServiceA1") ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
