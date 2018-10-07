package com.higgsup.example_config.annotation;

import com.higgsup.example_config.annotation.service.CatService;
import com.higgsup.example_config.annotation.service.DogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.higgsup.example_config.annotation")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
       // createLogicWhenCreateBean(applicationContext);
        DogService dogService = applicationContext.getBean("dogService", DogService.class);
        System.out.println(dogService.getNameDog());
    }

    private static void createLogicWhenCreateBean(ApplicationContext applicationContext) {
        CatService catService = applicationContext.getBean("catService", CatService.class);
        catService.getNameCat();
        CatService catService1 = applicationContext.getBean("catService", CatService.class);
        CatService catService2 = applicationContext.getBean("catService", CatService.class);
    }
}
