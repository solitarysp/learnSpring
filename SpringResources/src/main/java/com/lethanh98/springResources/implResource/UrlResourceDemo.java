package com.lethanh98.springResources.implResource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class UrlResourceDemo {
    public static void main(String[] args) throws Exception {
        Resource template = new UrlResource("https://raw.githubusercontent.com/solitarysp/Example-Learn-Spring/master/SpringConfigurations/src/main/resources/resource.txt");
        System.out.println(" Data đọc từ url " + IOUtils.toString(template.getInputStream(), "UTF-8"));
    }
}
