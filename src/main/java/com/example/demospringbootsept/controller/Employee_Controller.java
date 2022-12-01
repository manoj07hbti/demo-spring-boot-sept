package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Employee_Controller {


    @RequestMapping("/employee1_info")
    public Employee employee1Info(){

        Employee obj = new Employee("PARTH", 32000, 020, "TCS");

        return obj;

    }
    @RequestMapping("/employee2_info")
    public Employee employee2Info(){

        Employee obj = new Employee("SHIVANG", 40000, 022, "TCS");

        return obj;

    }

}
