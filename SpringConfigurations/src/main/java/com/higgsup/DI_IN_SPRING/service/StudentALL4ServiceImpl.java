package com.higgsup.DI_IN_SPRING.service;

import com.higgsup.DI_IN_SPRING.service.DI.BaseDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentALL4ServiceImpl implements BaseService {

    @Autowired
    @Qualifier("diConstructor")
    private BaseDI studentServiceConstructor;



    public void request() {
        System.out.println(studentServiceConstructor.toString());


    }
}
