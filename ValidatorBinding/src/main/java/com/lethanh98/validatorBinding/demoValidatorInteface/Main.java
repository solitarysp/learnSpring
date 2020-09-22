package com.lethanh98.validatorBinding.demoValidatorInteface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import java.util.Locale;

@ComponentScan("com.lethanh98.validatorBinding.demoValidatorInteface")

public class Main {
    @Autowired
    ApplicationContext applicationContext;

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Main.class);
    }

    @Bean
    public String beann() {
        //data
        Person person = Person.builder().name("thành").age(420).build();

        // cách 1
        DataBinder dataBinder = new DataBinder(person);
        dataBinder.setValidator(new PersonValidator());
        dataBinder.validate();
        System.out.println(dataBinder.getBindingResult().getAllErrors().get(0).getCode());

        // cách 2

        PersonValidator personValidator = new PersonValidator();
        BindingResult resultError = new BeanPropertyBindingResult(personValidator, personValidator.getClass().getSimpleName());
        personValidator.validate(person, resultError);
        System.out.println(resultError.getAllErrors().get(0).getCode());
        System.out.println(applicationContext.getMessage(resultError.getAllErrors().get(0), new Locale("en_US")));
        return "";
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
