package com.lethanh98.DI_IN_SPRING.service;

import com.lethanh98.DI_IN_SPRING.service.DI.DiConstructor;
import com.lethanh98.DI_IN_SPRING.service.DI.DiField;
import com.lethanh98.DI_IN_SPRING.service.DI.DiSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class StudentALLServiceImpl implements BaseService {
    private final DiConstructor studentServiceConstructor;
    private DiSetter studentServiceSetter;

    @Autowired
    DiField studentServiceField;

    @Required
    @Autowired
    public void setStudentServiceSetter(DiSetter studentServiceSetter) {
        this.studentServiceSetter = studentServiceSetter;
    }

    @Autowired
    public StudentALLServiceImpl(DiConstructor studentServiceConstructor) {
        this.studentServiceConstructor = studentServiceConstructor;
    }

    public void request() {
        System.out.println(studentServiceConstructor.toString());

        System.out.println(studentServiceSetter.toString());

        System.out.println(studentServiceField.toString());
    }
}
