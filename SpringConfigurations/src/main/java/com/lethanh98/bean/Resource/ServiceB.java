package com.lethanh98.bean.Resource;

import com.lethanh98.bean.customQualifier.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Service
@RestController
public class ServiceB {
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }

    @Resource
    public void setServiceA(@Genre("ServiceA1 Resource") ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
