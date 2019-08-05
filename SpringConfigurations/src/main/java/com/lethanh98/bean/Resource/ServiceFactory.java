package com.lethanh98.bean.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
    @Bean("ServiceA1 Resource")
    ServiceA create1() {
        return new ServiceA("ServiceA1 Resource");
    }
    @Bean("ServiceA2 Resource")
    ServiceA create2() {
        return new ServiceA("ServiceA2 Resource");
    }
}
