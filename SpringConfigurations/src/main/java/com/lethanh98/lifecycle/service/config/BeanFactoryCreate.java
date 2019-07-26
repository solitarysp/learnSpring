package com.lethanh98.lifecycle.service.config;

import com.lethanh98.lifecycle.service.AddressService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class BeanFactoryCreate implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equalsIgnoreCase("StudentService")) {
            System.out.println("Gọi 7");
            return new AddressService();
        }
        if (beanName.equalsIgnoreCase("seanFactoryCreate2")) {
            System.out.println("Gọi seanFactoryCreate2");
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
        if (beanName.equalsIgnoreCase("seanFactoryCreate2")) {
            System.out.println("Gọi seanFactoryCreate2");
            // return new AddressService();
        }
        return bean;
    }
}
