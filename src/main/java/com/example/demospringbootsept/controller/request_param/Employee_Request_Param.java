package com.example.demospringbootsept.controller.request_param;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Request_Param {
    @RequestMapping("/inform")
    public Employee getInfo(@RequestParam String name, @RequestParam int age,
                            @RequestParam String post, @RequestParam int salary){
        Employee obj = new Employee(name,age,post,salary);
        return obj;
    }
}
