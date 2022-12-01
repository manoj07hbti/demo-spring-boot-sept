package com.example.demospringbootsept.controller.controller;

import model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoEmployee {
    @RequestMapping("/emp")
    public ArrayList<Employee> employeeArrayList() {
        ArrayList<Employee> employees = new ArrayList<>();

        DemoEmployee obj=new DemoEmployee();

         Employee employee1=new Employee(21,"Jaydeep","IT");
         Employee employee2=new Employee(21,"Rahul","IT");
         Employee employee3=new Employee(25,"Kamal","CS");
         Employee employee4=new Employee(32,"Neeraj","IT");
         Employee employee5=new Employee(24,"Vedika","CS");
         Employee employee6=new Employee(29,"Annu","IT");

         employees.add(employee1);
         employees.add(employee2);
         employees.add(employee3);
         employees.add(employee4);
         employees.add(employee5);
         employees.add(employee6);

         return employees;
    }
}