package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCRUD_Controller {

    ArrayList<Employee> empArrayList = new ArrayList<>();

    @RequestMapping("/add_employee")
    public Employee addEmployee(@RequestBody Employee emp) {

        empArrayList.add(emp);

        return emp;
    }

    @RequestMapping("/get_emp")
    public ArrayList<Employee> getInfo() {

        return empArrayList;
    }


}
