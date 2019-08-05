package com.lethanh98.bean.customQualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
    @Bean("ServiceA1")
    ServiceA create1() {
        return new ServiceA("ServiceA1");
    }
    @Bean("ServiceA2")
    ServiceA create2() {
        return new ServiceA("ServiceA2");
    }
}
