package com.higgsup.lifecycle.service.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class BeanFactoryCreate implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equalsIgnoreCase("StudentService")) {
            System.out.println("Gọi 7");
            // return new AddressService();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //bean là object từ postProcessBeforeInitialization trả về
        if (beanName.equalsIgnoreCase("StudentService")) {
            System.out.println("Gọi 9");
            //   return new StudentService();
        }

        return bean;
    }
}
