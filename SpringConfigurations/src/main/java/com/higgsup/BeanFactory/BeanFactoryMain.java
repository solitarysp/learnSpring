package com.higgsup.BeanFactory;

import com.higgsup.BeanFactory.service.BaseService;
import com.higgsup.BeanFactory.service.StudentService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
public class BeanFactoryMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new GenericXmlApplicationContext("springConfig.xml");

        System.out.println("containsBean là true : " + beanFactory.containsBean("studentService"));
        System.out.println("containsBean là false  : " + beanFactory.containsBean("studentService1122"));

        System.out.println("get type, sẽ trả về url package  : " + beanFactory.getType("studentService"));

        // là Singleton thì true, k thì alf false
        System.out.println("check Singleton của bean : " + beanFactory.isSingleton("studentService2"));

        System.out.println("check Singleton của bean : " + beanFactory.getAliases("test"));


        // example getBean 1 param . return là Object. chúng ta cần case đến object cần sử dụng.
        // nếu k tìm thấy sẽ có Exception
        BaseService baseService = (BaseService) beanFactory.getBean("studentService");
        baseService.get();

        // trả về 1 bean  và đc case sẵn theo param thứ 2 truyền vào là một Class<T>
        BaseService baseService11 = beanFactory.getBean("studentService", StudentService.class);
        baseService.get();

    }
}
