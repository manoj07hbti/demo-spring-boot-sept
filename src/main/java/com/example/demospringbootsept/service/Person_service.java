package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Person_SQL;
import com.example.demospringbootsept.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class Person_service {
    @Autowired
     PersonRepository repository;

    //create
    public String add(Person_SQL personSql){
        repository.save(personSql);
        return "data add to db successful";
    }
    //get
    public List<Person_SQL> getAllPer(){
        return repository.findAll();
    }
    //update
    public String update(long id,String name){
        Person_SQL personSql= repository.getReferenceById(id);
        personSql.setName(name);
        repository.save(personSql);
        return "update new name: "+name;
    }
    public String update1(long id,String place){
        Person_SQL personSql= repository.getReferenceById(id);
        personSql.setPlace(place);
        repository.save(personSql);
        return "update new place: "+place;
    }
    public String update2(long id,String job){
        Person_SQL personSql= repository.getReferenceById(id);
        personSql.setJob(job);
        repository.save(personSql);
        return "update new job: "+job;
    }
    //delete
    public String delete(long id){
        repository.deleteById(id);
        return " delete index: "+id;
    }
}
