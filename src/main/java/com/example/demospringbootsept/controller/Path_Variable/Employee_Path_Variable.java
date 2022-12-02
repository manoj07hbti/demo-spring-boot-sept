package com.example.demospringbootsept.controller.Path_Variable;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Path_Variable {
    @RequestMapping("/info/{name}/{age}/{post}/{salary}")
    public Employee getInfo(@PathVariable String name,@PathVariable int age,
                            @PathVariable String post,@PathVariable int salary){
        Employee obj = new Employee(name,age,post,salary);
        return obj;
    }
}
