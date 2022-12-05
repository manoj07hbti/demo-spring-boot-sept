package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Path {
@RequestMapping("/info/{name}/{age}/{branch}")
public Employee employee_info(@PathVariable String name , @PathVariable int age ,@PathVariable String branch){

    Employee obj = new Employee(name, age, branch);
    return obj;
}
}
