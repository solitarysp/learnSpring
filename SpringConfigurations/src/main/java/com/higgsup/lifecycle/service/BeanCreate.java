package com.higgsup.lifecycle.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class BeanCreate implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("StudentService"))
        System.out.println("Gọi 6");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("StudentService"))
            System.out.println("Gọi 8");
        return bean;
    }
}
