package com.lethanh98.example_config.xml.service;

import org.springframework.beans.factory.InitializingBean;

public class AddressService implements InitializingBean{
    public String getAddressName() {
        return "ha noi";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("sau khi tạo thuộc tính bean AddressService");
    }
}
