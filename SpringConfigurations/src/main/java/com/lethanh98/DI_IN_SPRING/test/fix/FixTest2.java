package com.lethanh98.DI_IN_SPRING.test.fix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixTest2 {
    @Autowired
    FixTest1 test1;

    public void setTest1(FixTest1 test1) {
        this.test1 = test1;
    }
}
