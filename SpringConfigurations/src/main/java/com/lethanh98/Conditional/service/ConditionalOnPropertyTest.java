package com.lethanh98.Conditional.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty("msg2")
public class ConditionalOnPropertyTest implements BaseService {
    @Override
    public void request() {

    }
}
