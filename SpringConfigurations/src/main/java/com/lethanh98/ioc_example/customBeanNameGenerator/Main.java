package com.lethanh98.ioc_example.customBeanNameGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "com.lethanh98.ioc_example.customBeanNameGenerator", nameGenerator = MyNameGenerator.class)
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        // ở component team các bean sẽ chỉ được init khi bắt đầu được sử dụng. khi làm vậy tất cả các bean đó là lazy load luôn
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(s -> {
            System.out.println(s);
        });
    }
}
