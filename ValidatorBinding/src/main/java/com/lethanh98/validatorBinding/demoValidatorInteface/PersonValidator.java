package com.lethanh98.validatorBinding.demoValidatorInteface;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.reject("age.error0", "Không thể nhỏ hơn 0");
        } else if (p.getAge() > 110) {
            errors.reject("age.error110", "Không thể lớn hơn 110");
        }
    }
}
