package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Student;
import com.example.demospringbootsept.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    // method which will insert data to database

    public String add(Student student){

        repository.save(student); // save the object to db : insert into table (column)values ();

        return "Data saved to DB Successfully...";
    }

    public List<Student> getAllStd(){

      return  repository.findAll();// select * from table
    }

    public String update(long roll_no, String name){

        //STEP 1 :find the record which you want to update

       Student student= repository.getById(roll_no);// select * from table where id=roll_no

        //STEP 2 modify object and save to db again
        student.setName(name);// changed the name
        repository.save(student);// again saving modified object to database

        return "Record successfully updated with modified name: "+name;
    }


    public String delete(long roll_no){

        repository.deleteById(roll_no);// delete from table where roll_no=?

        return "Successfully delete record ";
    }

}
