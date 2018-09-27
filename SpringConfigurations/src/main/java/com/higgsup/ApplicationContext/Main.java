package com.higgsup.ApplicationContext;

import com.higgsup.ApplicationContext.bean.BeanPostProcessorTest;
import com.higgsup.ApplicationContext.bean.EvenPublisherBean2;
import com.higgsup.ApplicationContext.bean.MyEvenPublisherBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Locale;

@ComponentScan("com.higgsup.ApplicationContext")
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
     //  applicationEventPublisherTest(applicationContext);
       // resourceTest(applicationContext);
       //mssageSourceTest(applicationContext);
        BeanPostProcessorTest beanPostProcessorTest= applicationContext.getBean("beanPostProcessorTest",BeanPostProcessorTest.class);
    }

    private static void mssageSourceTest(ApplicationContext applicationContext) {
        MessageSource resources = applicationContext.getBean(MessageSource.class);
        System.out.println(resources.getMessage("msg.hello", null, "Default", new Locale("en_US")));
        System.out.println(resources.getMessage("msg.hello", null, "Default", new Locale("VI")));

    }

    private static void resourceTest(ApplicationContext applicationContext) throws IOException {
        Resource resource =
                applicationContext.getResource("resource.txt");
        System.out.println(resource.getDescription());
        System.out.println(resource.getFilename());
        System.out.println(resource.lastModified());
    }

    private static void applicationEventPublisherTest(ApplicationContext applicationContext) {
        MyEvenPublisherBean bean = applicationContext.getBean("myEvenPublisherBean",MyEvenPublisherBean.class);
        bean.sendMsg("A test message");

        bean.sendMsg("lê thành");
        bean.sendMsg("hahaha");
        bean.sendMsg("hihihi");


        EvenPublisherBean2 bean1 = applicationContext.getBean(EvenPublisherBean2.class);
        bean1.sendMsg("A test message");

        bean1.sendMsg("lê thành");
        bean1.sendMsg("hahaha");
        bean1.sendMsg("hihihi");
    }
}
