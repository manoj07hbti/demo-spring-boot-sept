package com.example.demospringbootsept.Service;

import com.example.demospringbootsept.Repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {
    @Autowired
    AppFlowRepository repository;
    public String message(){
        return repository.message();
    }
}
