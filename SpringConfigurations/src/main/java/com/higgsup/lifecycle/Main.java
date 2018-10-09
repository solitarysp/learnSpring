package com.higgsup.lifecycle;

import com.higgsup.lifecycle.service.StudentService;
import com.higgsup.lifecycle.service.config.BaseService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.higgsup.lifecycle")
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        BaseService baseService = (BaseService) applicationContext.getBean("studentService");
        baseService.request();
        applicationContext.close();
    }
}
