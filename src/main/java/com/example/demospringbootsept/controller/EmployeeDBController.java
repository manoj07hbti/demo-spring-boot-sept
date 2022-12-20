package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.model.Student;
import com.example.demospringbootsept.repository.EmployeeRepository;
import com.example.demospringbootsept.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class EmployeeDBController {
    @Autowired
    EmployeeService service;

    // CRUD Operation

    //C ==> Create

    @PostMapping("/add_employee_db")
    public String addEmployee(@RequestBody Employee employee){
            return  service.addEmployee(employee);
    }

    //R  ==> Read
    @GetMapping("/get_all_employee_db")
    public List<Employee> getall(){
        return service.getallemp();
    }

    //U==> Update

    @PostMapping("/update_employee_db/{empid}/{EmpName}")
    public String updateEmployee(@PathVariable long empid , @PathVariable String EmpName){
        return service.updateEmp(empid,EmpName);
    }

    //    D ==> Delete
    @DeleteMapping("/delete_employee/{empId}")
    public String delEmployee(@PathVariable long empId){
        return service.delEmployee(empId);
    }
}
