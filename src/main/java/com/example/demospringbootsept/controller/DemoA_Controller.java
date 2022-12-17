package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.service.DemoA_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoA_Controller {

    @Autowired
    DemoA_Service service;

    @RequestMapping("DemoA")
    public String welcome(){
        return service.welcome();



    }
}
