package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Medicines;
import com.example.demospringbootsept.repository.Medicine_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Medicine_Service {

    @Autowired
    Medicine_Repository repository;

    public String add(Medicines mdcns){
        repository.save(mdcns);
        return "Medicines add successfully";
    }

    public List<Medicines> get(){
        return repository.findAll();
    }

    public String update(int md_number, double price){
       Medicines mdcn= repository.getById(md_number);
       mdcn.setPrice(price);
       repository.save(mdcn);
       return "data changed successfully";
    }

    public String delete(int md_number){
         repository.deleteById(md_number);
         return "medicine data deleted successfully";
    }



}
