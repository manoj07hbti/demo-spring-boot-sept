package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Doctor_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demospringbootsept.service.Doctor_service;

@RestController
public class Doctor_Db {
@Autowired
    Doctor_service service;

    @PostMapping("/add_db")
    public String addDoctor(@RequestBody Doctor_list Doc){
        return service.add(Doc);

    }
}
