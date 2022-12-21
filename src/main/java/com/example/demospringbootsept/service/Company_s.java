package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Company_m;
import com.example.demospringbootsept.repository.Company_r;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Company_s {
    @Autowired
    Company_r repository;
    public String addCompany(Company_m company){
        repository.save(company);
        return "company has been added";
    }
    public List<Company_m> getAllCompanies(){
        return repository.findAll();
    }

   /* public List<Company_m> getCompany(int data){
        return repository.findAllByList_priceGreaterThan(data);
    }*/

}
