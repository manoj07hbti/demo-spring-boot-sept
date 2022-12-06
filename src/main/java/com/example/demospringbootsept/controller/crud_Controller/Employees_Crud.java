package com.example.demospringbootsept.controller.crud_Controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employees_Crud {
    //CRUD
    //TODO C: create/insert
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @RequestMapping("/add_emp")
    public Employee addEmployee( @RequestBody Employee info){
        employeeArrayList.add(info);
        return info;
    }
    @RequestMapping("/get_emp")
    public ArrayList<Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }
}
