package com.higgsup.Conditional.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
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
