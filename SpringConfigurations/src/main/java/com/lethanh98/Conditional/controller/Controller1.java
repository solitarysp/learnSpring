package com.lethanh98.Conditional.controller;

import com.lethanh98.Conditional.service.ConditionalOnPropertyTest;
import com.lethanh98.Conditional.service.Service1;
import com.lethanh98.Conditional.service.ServiceWhenMoth10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @Autowired
    Service1 service1;
    @Autowired
    ServiceWhenMoth10 request;
    @Autowired
    ConditionalOnPropertyTest request1;

    @RequestMapping("/")
    public void test() {
        service1.request();
        request.request();
        request1.request();
    }
}
