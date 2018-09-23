package com.higgsup.DI_IN_SPRING.service.DI;

import org.springframework.stereotype.Service;

@Service
public class DiField implements BaseDI {
    @Override
    public String toString() {
        return "Field DI";
    }
}
