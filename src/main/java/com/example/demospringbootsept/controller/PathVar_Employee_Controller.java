package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVar_Employee_Controller {


    @RequestMapping("/employee_info/{name}/{salary}/{id}/{company}")
    public Employee employeeInfo(@PathVariable String name, @PathVariable int salary, @PathVariable int id, @PathVariable String company){

        Employee employee = new Employee(name, salary, id , company);

        return employee;

    }
}
