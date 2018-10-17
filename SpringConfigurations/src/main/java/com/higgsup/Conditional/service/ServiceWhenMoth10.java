package com.higgsup.Conditional.service;

import com.higgsup.Conditional.conditional.InMonth10;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
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
