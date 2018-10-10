package com.higgsup.lifecycle.service.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;
public class BeanFactoryCreate2 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equalsIgnoreCase("StudentService")) {
            System.out.println("Gọi 72");
            // return new AddressService();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //bean là object từ postProcessBeforeInitialization trả về
        if (beanName.equalsIgnoreCase("StudentService")) {
            System.out.println("Gọi 92");
            //   return new StudentService();
        }

        return bean;
    }
}
