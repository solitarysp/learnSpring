package com.lethanh98.bean.CollectionBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.bean.CollectionBean")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        // lấy về list bean
        applicationContext.getBean(AllService.class).getServiceBases().stream().forEach(serviceBase -> {
            System.out.println(serviceBase.getName());
        });
        // lấy về list bean với key là name bean và value là object bean
        applicationContext.getBean(AllService.class).getServiceBasesMap().entrySet().forEach(stringServiceBaseEntry -> {
            System.out.println(stringServiceBaseEntry.getKey());
        });
        applicationContext.getBean(AllService.class).getServiceBasesSet().forEach(serviceBase -> {
            System.out.println(serviceBase.getName());
        });
        System.out.println("d");
    }
}
