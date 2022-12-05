package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmployeeList_Path {

    ArrayList<Employee> Emp = new ArrayList<>();
     @RequestMapping("/info/{name}/{age}/{branch}")
    public Employee info(@PathVariable String name, @PathVariable int age, @PathVariable String branch){

         Employee obj = new Employee(name, age, branch);
         Emp.add(obj);
         return obj;
     }
    @RequestMapping("/employee_list")
    public ArrayList<Employee> infoEmployee(){
        return Emp;
    }


}
