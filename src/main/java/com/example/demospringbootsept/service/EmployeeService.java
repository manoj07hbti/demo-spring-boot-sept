package com.example.demospringbootsept.service;


import com.example.demospringbootsept.Repository.EmployeeRepository;
import com.example.demospringbootsept.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository repository;

    //method which will insert data to db

    public String add(Employee employee){


        //it will save the data to db :  insert into table (column) values();
        repository.save(employee);

        return "data saved to database successfully";
    }

    public List<Employee> getEmp(){

        return  repository.findAll();  //:==select * from table
    }

    public String update(int id,String name){


        //step 1====  find the record which we want to update

       Employee employee= repository.getById(id);   //:==== select * from table where id = id


        //step 2==== modify object and save db again

        employee.setName(name);  //changed the name
        repository.save(employee);  //again saving modified object to db

        return  "record updated with modified name  :  " +name;
    }



         public String delete(int id){

         repository.deleteById(id);   //delete from table where id= '....'

             return  "successfully deleted record";
         }


}
