package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlow_Controller {


    @Autowired
    AppFlowService service;

    @RequestMapping("/app_flow")
    public String message(){


      //  AppFlowService obj = new AppFlowService();   //obj created of service class but in
        //  spring 'new' keyword is not allowed so we will use @Autowired annotation


        return service.message();
    }
}
