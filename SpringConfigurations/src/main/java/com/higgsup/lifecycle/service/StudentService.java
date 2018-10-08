package com.higgsup.lifecycle.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements BeanNameAware, BeanClassLoaderAware,BeanFactoryAware , InitializingBean {
    AddressService addressService;

    public StudentService() {
        System.out.println("Gọi 1");
    }

    @Autowired
    public void setAddressService(AddressService addressService) {
        System.out.println("Gọi 2");
        this.addressService = addressService;
    }

    @Override
    public void setBeanName(String name) {
        // Nó đặt tên của bean trong bean factory đã tạo bean này
        System.out.println("Gọi 3");

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Gọi 4");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Gọi 5");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Gọi 7");

    }
}
