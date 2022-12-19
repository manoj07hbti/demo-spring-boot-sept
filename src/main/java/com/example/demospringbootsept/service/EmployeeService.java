package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public String addEmployee(Employee employee){
        repository.save(employee);
        return "Data is saved successfully";
    }

    public List<Employee> getallemp(){
        return repository.findAll();
    }


}
