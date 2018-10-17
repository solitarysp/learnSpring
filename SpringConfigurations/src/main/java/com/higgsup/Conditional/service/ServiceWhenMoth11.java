package com.higgsup.Conditional.service;

import com.higgsup.Conditional.conditional.InMonth10;
import com.higgsup.Conditional.conditional.InMonth11;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional({InMonth11.class})
public class ServiceWhenMoth11 implements BaseService {
    public ServiceWhenMoth11() {
        System.out.println("");
    }
    @Override
    public void request() {

    }
}
