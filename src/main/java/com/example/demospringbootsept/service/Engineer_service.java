package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Engineer_SQL;
import com.example.demospringbootsept.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Engineer_service {
    @Autowired
    EngineerRepository repository;

    //create
    public String add(Engineer_SQL engineerSql){
        repository.save(engineerSql);
        return "data save to database successful";
    }
    //get
    public List<Engineer_SQL> getAlleng(){
        return repository.findAll();
    }
    //update
    public String update(long id, String name){
        Engineer_SQL engineerSql=repository.getReferenceById(id);
        engineerSql.setName(name);
        repository.save(engineerSql);
        return " update new name: "+name;
    }
    public String update1(long id, String post){
        Engineer_SQL engineerSql = repository.getReferenceById(id);
        engineerSql.setPost(post);
        repository.save(engineerSql);
        return "update new post: "+post;
    }
    public String update2(long id, String posting){
        Engineer_SQL engineerSql = repository.getReferenceById(id);
        engineerSql.setPosting(posting);
        repository.save(engineerSql);
        return "update new posting: "+posting;
    }
    public String update3(long id, String salary){
        Engineer_SQL engineerSql = repository.getReferenceById(id);
        engineerSql.setSalary(salary);
        repository.save(engineerSql);
        return "update new salary: "+salary;
    }
    //delete
    public String delete(long id){
        repository.deleteById(id);
        return "delete index successful: "+id;
    }
}
