package com.higgsup.IOC_container;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        System.out.println(ctx.getBean("hello"));

    }
}
