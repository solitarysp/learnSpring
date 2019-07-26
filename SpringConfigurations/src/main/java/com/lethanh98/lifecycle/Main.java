package com.lethanh98.lifecycle;

import com.lethanh98.lifecycle.service.config.BaseService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lethanh98.lifecycle")
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        BaseService baseService = (BaseService) applicationContext.getBean("studentService");
        baseService.request();
        applicationContext.close();
    }
}
