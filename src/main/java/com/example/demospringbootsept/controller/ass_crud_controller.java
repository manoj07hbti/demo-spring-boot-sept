package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ass_crud_controller {

    ArrayList<Employee> EmployeeArrayList = new ArrayList<>();

    @RequestMapping("/add_employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        EmployeeArrayList.add(employee);

        return employee;
    }
    @RequestMapping("/getting_data")
    public ArrayList<Employee>getting(){ return EmployeeArrayList;}






}
