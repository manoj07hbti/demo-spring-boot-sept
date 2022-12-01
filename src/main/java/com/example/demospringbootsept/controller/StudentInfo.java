package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfo {
    @RequestMapping("/student")
    public Student students(){
        return new Student("sachin",1);
    }
}
