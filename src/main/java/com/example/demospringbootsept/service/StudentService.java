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

    //method in which will insert data to database

    public String add(Student student){
        repository.save(student); // it will save the object to db : insert into table (column) values ();
        return "Data saved to DB successfully...";
    }

    public List<Student> getAllStd(){
        return repository.findAll();//Select * from Table

    }

    public String update(long rollNo, String name){

        // find the record which you want to update

        Student student=repository.getById(rollNo);  //select * from table where id = roll no

        //Step 2 modify object and save to db again
        student.setName(name); //changed the name
        repository.save(student); // again saving modified object to database
        return "Record Successfully Updated with modified Name .. " + name ;
    }

    public  String delete(long rollNo){

        repository.deleteById(rollNo); //delete from table where rollNo = "";
        return "Record Successfully Deleted";

    }

}
