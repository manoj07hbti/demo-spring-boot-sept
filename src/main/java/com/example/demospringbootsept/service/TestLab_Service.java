package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.TestLab;
import com.example.demospringbootsept.repository.TestLab_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestLab_Service {

    @Autowired
    TestLab_Repository repository;

    public String add(TestLab lab) {
        repository.save(lab);
        return "data added";
    }

    public List<TestLab> get() {
        return repository.findAll();
    }

    public String put(long id, String name,String city) {
        TestLab lab = repository.getById(id);
        lab.setName(name);
        lab.setCity(city);
        repository.save(lab);
        return "data add successfully.." + name;
    }

    public String delete(long id) {
        repository.deleteById(id);
        return "data deleted";
    }

    public TestLab findById(long id){
       return repository.findById(id);

    }

    public TestLab findByCity(String city){
        return repository.findByCity(city);
    }

    public TestLab findByName(String name){
        return repository.findByName(name);
    }

}
