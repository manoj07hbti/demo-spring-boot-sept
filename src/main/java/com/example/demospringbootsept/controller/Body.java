package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Body {

    ArrayList<Student> list=new ArrayList<>();
    @RequestMapping("/student_data")
    public Student create(@RequestBody Student std){
        list.add(std);
        return std;
    }
    @RequestMapping("/getting_info")
    public ArrayList<Student> getting(){
        return list;
    }
}
