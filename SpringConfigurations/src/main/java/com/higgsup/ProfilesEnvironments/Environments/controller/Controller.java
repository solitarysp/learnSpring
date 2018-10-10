package com.higgsup.ProfilesEnvironments.Environments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ConfigurableEnvironment env;
    // lấy về các thuộc tính của các biến môi trường
    @RequestMapping("/getSystemEnvironment")
    public Object get() {
        return env.getSystemEnvironment();
    }

    // độ ưu tiên các biến môi trường/ hệ thống sẽ cao hươn các biến mình tự định nghĩa.
    @RequestMapping("/checkDoUuTien")
    public Object getCheckDoUuTien() {
        return env.getProperty("JAVA_HOME");
    }
        // lấy về các thuộc tính của hệ thống
    @RequestMapping("/getSystemProperties")
    public Object getSystemProperties() {
        return env.getSystemProperties();
    }
}
