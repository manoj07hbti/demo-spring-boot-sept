package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public String updateEmp(long empid,String EmpName){

        Employee employee = repository.getById(empid);
        employee.setEmpName(EmpName);
        repository.save(employee);
        return "Employee Name is updated successfully";
    }

    public String delEmployee(long empId){
        repository.deleteById(empId);
        return "Employee witd Id  " + empId +" is deleted successfully";

    }


}
