package com.higgsup.Conditional.controller;

import com.higgsup.Conditional.service.ConditionalOnPropertyTest;
import com.higgsup.Conditional.service.Service1;
import com.higgsup.Conditional.service.ServiceWhenMoth10;
import com.higgsup.Conditional.service.ServiceWhenMoth11;
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
