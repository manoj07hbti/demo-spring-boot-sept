package com.example.demospringbootsept.controller.pathvariablecontroller;

import model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEmployee1 {

    //@RequestMapping("/endpoint_name/{variable_name1}/{variable_name2}/{variable_name3}")//
    @RequestMapping("/emp1/{name}/{age}/{department}") //localhost:9090/emp1/
    public Employee employeeArrayList(@PathVariable String name, @PathVariable int age, @PathVariable String department) {

       Employee employee=new Employee(age,name,department);

       return employee;




    }
}