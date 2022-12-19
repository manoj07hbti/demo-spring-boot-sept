package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Doctor_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringbootsept.repository.Doctor_repository;

@Service
public class Doctor_service {

@Autowired
    Doctor_repository repository;

    public String add(Doctor_list Doc){
        repository.save(Doc);
        return  "Data save to db";

    }


}
