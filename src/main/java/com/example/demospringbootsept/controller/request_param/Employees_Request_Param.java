package com.example.demospringbootsept.controller.request_param;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employees_Request_Param {
    ArrayList<com.example.demospringbootsept.model.Employee> Employee=new ArrayList<>();

    @RequestMapping("/information")
    public Employee getInfo(@RequestParam String name, @RequestParam int age,
                            @RequestParam String post, @RequestParam int salary){
        Employee obj = new Employee(name,age,post,salary);
        Employee.add(obj);
        return obj;
    }
    @RequestMapping("Employees_list")
    public ArrayList<Employee> infoEmployee(){
        return Employee;
    }
}
