package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Engineer_m;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringbootsept.repository.Engineer_r;

import java.util.List;

@Service
public class Engineer_s {
    @Autowired
    Engineer_r repository;

    public String addEng(Engineer_m eng1){
        repository.save(eng1);
        return "the Engineer details has been added";
    }
    public List<Engineer_m> get_engg_data(){
        List<Engineer_m> list = repository.findAll();
        return list;
    }
    public String update_name(int id,String name){
       Engineer_m engg = repository.getById(id);
       engg.setName(name);
       repository.save(engg);
       return "Name has been updated";
    }
    public String update_dpt(int id,String dpt){
       Engineer_m engg = repository.getById(id);
       engg.setDpt(dpt);
       repository.save(engg);
       return "Department has been updated";
    }
    public String update_salary(int id,double salary){
       Engineer_m engg = repository.getById(id);
       engg.setSalary(salary);
       repository.save(engg);
       return "Salary has been updated";
    }
    public String delete_engg(int id){
        Engineer_m engg = repository.getById(id);
        repository.delete(engg);
        return "Engineer details has been deleted";
    }
}
