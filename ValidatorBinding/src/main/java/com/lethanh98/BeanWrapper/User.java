package com.lethanh98.BeanWrapper;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

@FieldNameConstants
public class User implements Serializable {
    @Getter
    private String name;
    @Setter
    @Getter
    private Integer age;
}
