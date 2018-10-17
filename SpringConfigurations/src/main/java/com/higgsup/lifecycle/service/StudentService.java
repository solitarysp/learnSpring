package com.higgsup.lifecycle.service;

import com.higgsup.lifecycle.conditional.InMonth10;
import com.higgsup.lifecycle.service.config.BaseService;
import com.higgsup.lifecycle.service.config.RootService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional({InMonth10.class})
public class StudentService implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, BaseService {
    AddressService addressService;
    RootService rootService;

    @Autowired
    ApplicationContext applicationContext;

    public StudentService() {
        System.out.println("Gọi 1");
    }

    @Autowired
    public void setAddressService(AddressService addressService) {
        System.out.println("Gọi 2 set addressService");
        this.addressService = addressService;
    }

    @Autowired
    public void setRootService(RootService rootService) {
        System.out.println("Gọi 2 set rootService");

        this.rootService = rootService;
    }

    @Override
    public void setBeanName(String name) {
        // param name sẽ là name của bean này
        System.out.println("Gọi 3");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        // param là class loader được sử dụng bởi factory để loader class này.
        System.out.println("Gọi 4");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Gọi 5");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Gọi 6");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Gọi 8");

    }


    @Override
    public void destroy() throws Exception {
        System.out.println("hủy bean");
    }

    public void request() {
        System.out.println("request StudentService");
    }
}
