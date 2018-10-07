package com.higgsup.example_config.xml.service;

import org.springframework.beans.factory.InitializingBean;

public class StudentService implements InitializingBean {
    private AddressService addressService;

    public void getNameAndAddressStudent() {
        System.out.println(addressService.getAddressName() + ": Le Thanh");
    }

    public AddressService getAddressService() {
        return addressService;
    }
    // mặc định xml tiêm phụ thuộc sẽ qua setter, nếu k dùng constructor
    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("sau khi tạo thuộc tính bean StudentService");

    }
}
