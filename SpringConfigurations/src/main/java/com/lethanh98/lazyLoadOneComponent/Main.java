package com.lethanh98.lazyLoadOneComponent;

import com.lethanh98.lazyLoadOneComponent.main.MainServiceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lethanh98.lazyLoadOneComponent.factory")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        // ở component main các bean sẽ chỉ được init khi bắt đầu được sử dụng
        applicationContext.getBean(MainServiceA.class);
        System.out.println("");
    }
}
