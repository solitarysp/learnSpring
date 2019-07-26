package com.lethanh98.bean.CircularDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.bean.CircularDependencies")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(applicationContext.getBean(AService.class).getbService().getName());
        System.out.println(applicationContext.getBean(BService.class).getaService().getName());
    }
}
