package com.lethanh98.springResources.ResourceInterfaceDemo;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;

@ComponentScan("com.lethanh98.springResources.ResourceInterfaceDemo")
public class ResourceInterfaceDemoApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ResourceInterfaceDemoApp.class);
        Resource reFile = ctx.getResource("resourceInterfaceDemo.properties");
        System.out.println("Data đọc từ File: " + IOUtils.toString(reFile.getInputStream(), "UTF-8"));

        Resource template = ctx.getResource("https://raw.githubusercontent.com/solitarysp/Example-Learn-Spring/master/SpringConfigurations/src/main/resources/resource.txt");
        System.out.println(" Data đọc từ url " + IOUtils.toString(template.getInputStream(), "UTF-8"));

    }
}
