package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ass_employee_List {

    @RequestMapping("/employee/{name}/{age}/{place}/{sector}")
    public Employee employee(@PathVariable String name, @PathVariable int age, @PathVariable String place, @PathVariable String sector){
        Employee employee=new Employee(name,age,place,sector);


        return employee;

    }
}
