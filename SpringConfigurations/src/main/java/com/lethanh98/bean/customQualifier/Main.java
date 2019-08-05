package com.lethanh98.bean.customQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.bean.customQualifier")
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(applicationContext.getBean(ServiceB.class).getServiceA().getName());
    }
}
