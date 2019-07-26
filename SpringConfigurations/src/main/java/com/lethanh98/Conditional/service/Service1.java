package com.lethanh98.Conditional.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnWebApplication
//@ConditionalOnNotWebApplication
public class Service1 implements BaseService {
    @Override
    public void request() {
        System.out.println("test");
    }
}
