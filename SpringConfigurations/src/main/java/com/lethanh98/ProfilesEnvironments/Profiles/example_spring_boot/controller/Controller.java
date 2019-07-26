package com.lethanh98.ProfilesEnvironments.Profiles.example_spring_boot.controller;

import com.lethanh98.ProfilesEnvironments.Profiles.example_spring_boot.factory.SqlFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    SqlFactory sqlFactory;

    @RequestMapping("/")
    public SqlFactory checkConnectSQl() {
        return sqlFactory;
    }
}
