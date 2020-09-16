package com.lethanh98.springResources.ResourceLoader;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceLoaderFile {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ResourceLoaderFile.class);
        Resource template;
        template = ctx.getResource("classpath:resourceInterfaceDemo.properties");
        System.out.println("Data đọc từ classpath: " + IOUtils.toString(template.getInputStream(), "UTF-8"));

        template = ctx.getResource("resourceInterfaceDemo.properties");
        System.out.println("Data đọc từ File: " + IOUtils.toString(template.getInputStream(), "UTF-8"));

        template = ctx.getResource("https://raw.githubusercontent.com/solitarysp/Example-Learn-Spring/master/SpringConfigurations/src/main/resources/resource.txt");
        System.out.println("Data đọc từ url " + IOUtils.toString(template.getInputStream(), "UTF-8"));

        template = ctx.getResource("file:///C:\\project\\me\\Example-Learn-Spring\\SpringResources\\src\\main\\resources\\resourceInterfaceDemo.properties");
        System.out.println("Data đọc từ file " + IOUtils.toString(template.getInputStream(), "UTF-8"));

    }
}
