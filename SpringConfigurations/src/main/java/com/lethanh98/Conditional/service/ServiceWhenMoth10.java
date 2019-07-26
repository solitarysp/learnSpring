package com.lethanh98.Conditional.service;

import com.lethanh98.Conditional.conditional.InMonth10;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
@Service
@Conditional({InMonth10.class})
@ConditionalOnClass
public class ServiceWhenMoth10 implements BaseService {
    public ServiceWhenMoth10() {
        System.out.println("");
    }

    @Override
    public void request() {
        System.out.println("thang 10");
    }
}
