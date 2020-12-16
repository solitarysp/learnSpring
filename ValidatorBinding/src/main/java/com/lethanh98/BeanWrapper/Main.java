package com.lethanh98.BeanWrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();

    }

    private static void example2() {
        User user = new User();
        user.setAge(18);
        BeanWrapper target = new BeanWrapperImpl(user);
    }

    private static void example1() {
        User user = new User();
        user.setAge(18);
        BeanWrapper target = new BeanWrapperImpl(user);
        target.setPropertyValue(User.Fields.age, 123);
        System.out.println(user.getAge());
        System.out.println(target.getPropertyType(User.Fields.age));
        System.out.println(target.getPropertyValue(User.Fields.age));
    }
}
