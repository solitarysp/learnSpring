package com.higgsup.Scopes.singletonAndPrototype;

import com.higgsup.Scopes.singletonAndPrototype.service.PrototypeService;
import com.higgsup.Scopes.singletonAndPrototype.service.SingletonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.higgsup.Scopes.singletonAndPrototype")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        testSingleton(applicationContext);
        System.out.println("=========================");
        testPrototypeService(applicationContext);
    }

    private static void testPrototypeService(ApplicationContext applicationContext) {
        for (int i = 0; i < 10; i++) {
            PrototypeService prototypeService = applicationContext.getBean(PrototypeService.class);
            System.out.println(prototypeService);
        }
    }

    private static void testSingleton(ApplicationContext applicationContext) {
        for (int i = 0; i < 10; i++) {
            SingletonService singletonService = applicationContext.getBean(SingletonService.class);
            System.out.println(singletonService);
        }
    }
}
