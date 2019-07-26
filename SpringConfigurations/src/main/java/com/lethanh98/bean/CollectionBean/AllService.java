package com.lethanh98.bean.CollectionBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Lazy
public class AllService {
    List<ServiceBase> serviceBases;
    @Autowired
    public AllService(List<ServiceBase> serviceBases) {
        this.serviceBases = serviceBases;
    }

    public AllService() {
    }

    public List<ServiceBase> getServiceBases() {
        return serviceBases;
    }

    public void setServiceBases(List<ServiceBase> serviceBases) {
        this.serviceBases = serviceBases;
    }
}
