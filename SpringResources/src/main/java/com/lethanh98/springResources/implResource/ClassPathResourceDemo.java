package com.lethanh98.springResources.implResource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassPathResourceDemo {
    public static void main(String[] args) throws Exception {
        Resource template = new ClassPathResource("resourceInterfaceDemo.properties");
        System.out.println(" Data đọc từ url " + IOUtils.toString(template.getInputStream(), "UTF-8"));
    }
}
