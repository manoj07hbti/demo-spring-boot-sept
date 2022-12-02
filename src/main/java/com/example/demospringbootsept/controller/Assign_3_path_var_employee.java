package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Assign_3_path_var_employee {

    ArrayList<Employee> employeeInfo = new ArrayList<>();


    @RequestMapping("/employee1/{name}/{department}/{id}/{salary}")
    public Employee emp(@PathVariable String name, @PathVariable String department,@PathVariable  int id, @PathVariable Double salary){
        Employee emp1 = new Employee(name,department,id,salary);
        employeeInfo.add(emp1);
        return emp1;
    }
    @RequestMapping("/employee2")
    public ArrayList<Employee> info(){
        return employeeInfo;
    }
}
