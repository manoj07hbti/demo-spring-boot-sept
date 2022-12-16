package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Engineer;
import com.example.demospringbootsept.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository engineerRepository;

    public String addEng(Engineer engineer){

        engineerRepository.save(engineer);

        return "DATA SAVED TO DB";

    }

    public List<Engineer> getAllEng(){

        return engineerRepository.findAll();
    }

    public String updateEng(long id,String name){

       Engineer engineer= engineerRepository.getReferenceById(id);

       engineer.setName(name);
       engineer.save(engineer);

        return "RECORD UPDATED--."+name;
    }

    public String deleteEng(long id){

        engineerRepository.deleteById(id);

        return "DELETED RECORD";
    }

}
