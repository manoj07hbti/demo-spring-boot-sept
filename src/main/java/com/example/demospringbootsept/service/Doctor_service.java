package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Doctor_SQL;
import com.example.demospringbootsept.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Doctor_service {

    @Autowired
    DoctorRepository repository;
    //method which will be insart data and database
    public String add(Doctor_SQL doctorSql){
        repository.save(doctorSql);             // save the object to db: insert into table (column)values();
        return "data save to db successfully";
    }
     public List<Doctor_SQL> getAlldoc(){
         return repository.findAll();         // select * form table
     }
    //update
    public  String update(long id, String name){
        // STEP 1:find the record which you want to update
        Doctor_SQL doctorSql = repository.getById(id);// select * form table where  id = id

        // STEP 2: modify object and save to db again
        doctorSql.setName(name);  // change the name
        repository.save(doctorSql);      // again saving modified object to the database
        return "record update successfully with new modified name "+name ;
    }
    public  String delete(long id){
        repository.deleteById(id);          // delete form table where id =?
        return " delete  record successfully";
    }

}
