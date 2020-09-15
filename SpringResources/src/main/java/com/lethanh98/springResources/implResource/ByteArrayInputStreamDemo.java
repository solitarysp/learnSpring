package com.lethanh98.springResources.implResource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String rs = "test=test";
        ByteArrayResource byteArrayInputStream = new ByteArrayResource(rs.getBytes());
        System.out.println(IOUtils.toString(byteArrayInputStream.getInputStream(), "UTF-8"));
    }
}
