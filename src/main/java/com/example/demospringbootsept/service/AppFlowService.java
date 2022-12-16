package com.example.demospringbootsept.service;

import com.example.demospringbootsept.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;// object create by spring

    public String message(){

        return repository.message();
    }

}
