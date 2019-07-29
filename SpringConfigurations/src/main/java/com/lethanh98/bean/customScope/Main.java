package com.lethanh98.bean.customScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.bean.customScope")
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        do {
            System.out.println(applicationContext.getBean(ServiceA.class).getName());
            Thread.sleep(1000);
        } while (true);
    }
}
