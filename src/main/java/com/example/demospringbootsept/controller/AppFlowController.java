package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class AppFlowController {
    @Autowired
    AppFlowService Service;
    @RequestMapping("/app_flow")
    public String message(){
//        AppFlowService obj = new AppFlowService();// object is created
//            return obj.message();
        return Service.message();
    }
}
