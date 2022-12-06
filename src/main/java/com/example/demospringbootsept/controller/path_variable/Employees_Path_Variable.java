package com.example.demospringbootsept.controller.path_variable;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employees_Path_Variable {

    ArrayList<Employee> Employee=new ArrayList<>();

    @RequestMapping("/employees/{name}/{age}/{post}/{salary}")
    public Employee getInfo(@PathVariable String name,@PathVariable int age,
                            @PathVariable String post,@PathVariable int salary){
        Employee obj = new Employee(name,age,post,salary);
        Employee.add(obj);
        return obj;
    }
    @RequestMapping("Employee_list")
    public ArrayList<Employee> infoEmployee(){
        return Employee;
    }
}
