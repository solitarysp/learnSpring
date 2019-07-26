package com.lethanh98.BeanFactory.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class StudentService implements BaseService, BeanNameAware {
    private Integer id;

    public StudentService() {
        id=100;
    }
    public StudentService(Integer value) {
        id=value;

    }
    public void get() {
        System.out.println(++id);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);

    }

}
