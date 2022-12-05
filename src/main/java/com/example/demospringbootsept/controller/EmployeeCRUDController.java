package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class EmployeeCRUDController {

    ArrayList <Employee> employeeArrayList=new ArrayList<>();
    //CRUD
    //1.C : CREATE /INSERT  ---> POST

    @RequestMapping("/add_employee")
    public Employee addEmployee(@RequestBody  Employee employee){
        employeeArrayList.add(employee);
        return employee;
    }

    @RequestMapping("/get_employee")
    public ArrayList<Employee> getData(){
        return employeeArrayList;
    }
}
