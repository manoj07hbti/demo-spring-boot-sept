package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {


    @Autowired
    EmployeeService service;

    //CRUD OPERATION

    @PostMapping("/add_emp_db")
    public String addEmployee(@RequestBody Employee employee) {

        return service.add(employee);
    }

    //READ

    @GetMapping("/get_all_emp")
    public List<Employee> getEmp() {

        return service.getEmp();

    }

    @PutMapping("/update_emp_db/{id}/{name}")
    public String update(@PathVariable int id, @PathVariable String name) {

        return service.update(id, name);


    }

    @DeleteMapping("/delete_emp_db/{id}")
    public String delete(@PathVariable int id) {

        return service.delete(id);

    }
}
