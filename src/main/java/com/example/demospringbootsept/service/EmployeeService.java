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

    public String add(Employee employe){

        repository.save(employe);  // save the object to db : insert into table (column)values ();

        return "Data saved to DB Successfully";
    }

    public List<Employee> getAllEmp(){

        return repository.findAll();  // select * from table
    }

    public String update(long code, String name){
        //STEP 1 :find the record which you want to update

        Employee employe=repository.getById(code); // select * from table where id=roll_no

        //STEP 2 modify object and save to db again

        employe.setName(name);  // changed the name
        repository.save(employe);  // again saving modified object to database

        return "Record Successfully updated wit modified name: "+name;
    }

    public String delete(Long code){

        repository.deleteById(code);  // delete from table where roll_no=?

        return "Record Successfully deleted";
    }
}
