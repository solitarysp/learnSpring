package com.lethanh98.DI_IN_SPRING.service;

import com.lethanh98.DI_IN_SPRING.service.DI.DiConstructor;
import com.lethanh98.DI_IN_SPRING.service.DI.DiSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentALL2ServiceImpl implements BaseService {
    private DiConstructor studentServiceConstructor;
    private DiSetter studentServiceSetter;

    @Autowired
    public StudentALL2ServiceImpl(DiConstructor studentServiceConstructor, DiSetter studentServiceSetter) {
        this.studentServiceConstructor = studentServiceConstructor;
        this.studentServiceSetter = studentServiceSetter;
    }

    public StudentALL2ServiceImpl(DiConstructor studentServiceConstructor) {
        this.studentServiceConstructor = studentServiceConstructor;
    }

    public StudentALL2ServiceImpl() {
    }

    public void request() {
        System.out.println(studentServiceConstructor.toString());

        System.out.println(studentServiceSetter.toString());
    }
}
