package com.higgsup.DI_IN_SPRING.test;

import com.higgsup.DI_IN_SPRING.test.error.Test1;
import com.higgsup.DI_IN_SPRING.test.fix.FixTest1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.higgsup.DI_IN_SPRING.test")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        FixTest1 fFixTest1= (FixTest1) applicationContext.getBean("fixTest1");
        System.out.println(fFixTest1.toString());;



       /* Test1 test1= (Test1) applicationContext.getBean("test1");
        test1.toString();*/
    }
}
