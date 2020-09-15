package com.lethanh98.springResources.implResource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.InputStreamResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamResourceDemo {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\project\\me\\Example-Learn-Spring\\SpringResources\\src\\main\\resources\\resourceInterfaceDemo.properties");
        InputStreamResource inputStreamResource = new InputStreamResource(input);
        System.out.println(" Data đọc từ url " + IOUtils.toString(inputStreamResource.getInputStream(), "UTF-8"));

    }
}
