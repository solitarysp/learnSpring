package com.lethanh98.validatorBinding.demoValidatorInteface;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private int age;
}
