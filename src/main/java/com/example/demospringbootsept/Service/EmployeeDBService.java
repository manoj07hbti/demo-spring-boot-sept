package com.example.demospringbootsept.Service;

import com.example.demospringbootsept.Repository.EmployeeDBRepository;
import com.example.demospringbootsept.model1.Employee_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeDBService {
    @Autowired
    EmployeeDBRepository repository;
    public String add(Employee_1 employee){
        repository.save(employee);
        return"Data added succesfully";
    }
    public List<Employee_1> get(){
        return repository.findAll();
    }
    public String update(@PathVariable int id,@PathVariable String company){
        Employee_1 employee=repository.getById(id);
        employee.setCompany(company);
        repository.save(employee);
        return"Company update Successfully";

    }
    public String remove(@PathVariable int id){
        repository.deleteById(id);
        return"Data deleted Successfully";

    }
}
