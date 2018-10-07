package com.higgsup.example_config.xml;

import com.higgsup.example_config.xml.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("example_config_XML.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.getNameAndAddressStudent();
    }
}
