package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.repository.Engineer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Engineer{

    @Autowired
    Engineer_Repository repository;

    public String add(Engineer eng){
        repository.save(eng);
        return "data add successfully";
    }

    public List<Engineer> get(){
         return repository.findAll();

    }

    public String update(int id, String name){
        Engineer eng = repository.getById(id);
        eng.setName(name);
        repository.save(eng);
        return "record successfully updated..."+name;
    }

    public String delete(int id){
        repository.deleteById(id);
        return "record successfully deleted";
    }



















}
