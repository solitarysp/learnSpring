package com.lethanh98.springResources.implResource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSystemResourceDemo {
    public static void main(String[] args) throws Exception {
        Resource template = null;
        template = new FileSystemResource("C:\\project\\me\\Example-Learn-Spring\\SpringResources\\src\\main\\resources\\resourceInterfaceDemo.properties");
        System.out.println(" Data đọc từ url " + IOUtils.toString(template.getInputStream(), "UTF-8"));
    }
}
