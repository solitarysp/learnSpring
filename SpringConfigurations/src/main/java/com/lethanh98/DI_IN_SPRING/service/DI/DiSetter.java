package com.lethanh98.DI_IN_SPRING.service.DI;

import org.springframework.stereotype.Service;

@Service
public class DiSetter implements BaseDI {
    @Override
    public String toString() {
        return "Setter DI";
    }
}
