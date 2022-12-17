package com.example.demospringbootsept.Collector2;

import com.example.demospringbootsept.Service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppFlowController {
    @Autowired
    AppFlowService service;
    @RequestMapping("/app_flow")
    public String message(){
        return service.message();
    }
}
