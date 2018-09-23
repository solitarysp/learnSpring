package com.higgsup.DI_IN_SPRING.service.DI;

import org.springframework.stereotype.Service;

@Service
public class DiConstructor implements BaseDI {
    @Override
    public String toString() {
        return "Constructor DI";
    }
}
