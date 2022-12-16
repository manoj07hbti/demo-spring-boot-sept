package com.example.demospringbootsept.service;

import com.example.demospringbootsept.repository.EngineerAppFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {
    @Autowired
    EngineerAppFlow repository;

    public String message(){

        return repository.message();
    }

}
