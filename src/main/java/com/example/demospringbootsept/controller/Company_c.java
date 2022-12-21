package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Company_m;
import com.example.demospringbootsept.service.Company_s;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Company_c {
@Autowired
    Company_s service;
@PostMapping("/add_company")
    public String addCompany(@RequestBody Company_m company){
        return service.addCompany(company);
    }
@GetMapping("/get_all_companies")
    public List<Company_m> getAllCompanies(){
    return service.getAllCompanies();
    }
/*
@RequestMapping("/get_company")
    public List<Company_m> getCompany(@RequestParam int data){
    return service.getCompany(data);
    }
*/

}
