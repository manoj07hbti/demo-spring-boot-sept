package com.example.demospringbootsept.service;

import com.example.demospringbootsept.repository.DemoA_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoA_Service {

    @Autowired
    DemoA_Repository repository;

    public String welcome(){
        return repository.welcome();

    }
}
