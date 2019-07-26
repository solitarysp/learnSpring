package com.lethanh98.bean.CollectionBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.bean.CollectionBean")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        applicationContext.getBean(AllService.class).getServiceBases().stream().forEach(serviceBase -> {
            System.out.println(serviceBase.getName());
        });
    }
}
