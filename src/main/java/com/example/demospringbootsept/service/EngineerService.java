package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository repository;

    public String add(Engineer engineer){

        repository.save(engineer);
        return "Engineer data save in to Database";
    }

    public List<Engineer> getAllEng(){
        return repository.findAll();
    }

    public String update(long id,String name){
        Engineer engineer=repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);

        return "Record updated successfully";
    }

    public String delete(long id){
        repository.deleteById(id);
        return "Delete record successfully";
    }
}
