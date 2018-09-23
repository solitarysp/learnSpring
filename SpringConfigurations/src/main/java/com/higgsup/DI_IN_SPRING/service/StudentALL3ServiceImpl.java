package com.higgsup.DI_IN_SPRING.service;

import com.higgsup.DI_IN_SPRING.service.DI.DiConstructor;
import com.higgsup.DI_IN_SPRING.service.DI.DiSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentALL3ServiceImpl implements BaseService {
    private DiConstructor studentServiceConstructor;
    private DiSetter studentServiceSetter;

    @Autowired
    public void setStudentServiceSetter(DiConstructor studentServiceConstructor, DiSetter studentServiceSetter) {
        this.studentServiceConstructor = studentServiceConstructor;
        this.studentServiceSetter = studentServiceSetter;
    }

    public void request() {
        System.out.println(studentServiceConstructor.toString());

        System.out.println(studentServiceSetter.toString());

    }
}
