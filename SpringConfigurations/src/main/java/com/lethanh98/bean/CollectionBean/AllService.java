package com.lethanh98.bean.CollectionBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@Lazy
public class AllService {
    List<ServiceBase> serviceBases;
    @Autowired
    Map<String, ServiceBase> serviceBasesMap;
    @Autowired
    Set<ServiceBase> serviceBasesSet;
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

    public Map<String, ServiceBase> getServiceBasesMap() {
        return serviceBasesMap;
    }

    public void setServiceBasesMap(Map<String, ServiceBase> serviceBasesMap) {
        this.serviceBasesMap = serviceBasesMap;
    }

    public Set<ServiceBase> getServiceBasesSet() {
        return serviceBasesSet;
    }

    public void setServiceBasesSet(Set<ServiceBase> serviceBasesSet) {
        this.serviceBasesSet = serviceBasesSet;
    }
}
