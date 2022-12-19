package com.example.demospringbootsept.controller1;

import com.example.demospringbootsept.Service.EmployeeDBService;
import com.example.demospringbootsept.model1.Employee_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {
    @Autowired
    EmployeeDBService service;
    @PostMapping("/employee_add")
    public String add(@RequestBody Employee_1 employee){
        return service.add(employee);
    }
    @GetMapping("/employee_get")
    public List<Employee_1> get(){
        return service.get();
    }
    @PutMapping("/employee_update/{id}/{company}")
    public String update(@PathVariable int id,@PathVariable String company){
        return service.update(id,company);
    }
    @DeleteMapping("/employee_delete/{id}")
    public String remove(@PathVariable int id){
        return service.remove(id);
    }
}
