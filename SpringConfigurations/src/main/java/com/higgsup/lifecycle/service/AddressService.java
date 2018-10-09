package com.higgsup.lifecycle.service;

import com.higgsup.lifecycle.service.config.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements BaseService {
    @Override
    public void request() {
        System.out.println("request AddressService");
    }
}
