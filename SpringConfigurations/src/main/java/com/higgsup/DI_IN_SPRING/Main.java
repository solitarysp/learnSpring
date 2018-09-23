package com.higgsup.DI_IN_SPRING;

import com.higgsup.DI_IN_SPRING.service.BaseService;
import com.higgsup.DI_IN_SPRING.service.DI.DTOService;
import com.higgsup.DI_IN_SPRING.service.DI.DiConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.higgsup.DI_IN_SPRING")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        BaseService baseService = (BaseService) applicationContext.getBean("studentALL4ServiceImpl");
        baseService.request();

        DiConstructor baseDI = (DiConstructor) applicationContext.getBean("diConstructor");
        System.out.println(baseDI.toString());;

        DTOService dTOService = (DTOService) applicationContext.getBean("DTOService");

    }
}
