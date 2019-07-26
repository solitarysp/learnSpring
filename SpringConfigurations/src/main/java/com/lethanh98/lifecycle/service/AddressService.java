package com.lethanh98.lifecycle.service;

import com.lethanh98.lifecycle.service.config.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements BaseService {
    @Override
    public void request() {
        System.out.println("request AddressService");
    }
}
