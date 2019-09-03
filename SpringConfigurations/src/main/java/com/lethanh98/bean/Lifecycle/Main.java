package com.lethanh98.bean.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * author lethanh9398 <p>
 * create Date 30-08-2019 16:11  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */

@ComponentScan("com.lethanh98.bean.Lifecycle")
@Configuration
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        ((AnnotationConfigApplicationContext) applicationContext).destroy();
    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    ObjectBean beanObject() {
        return new ObjectBean();
    }

}
