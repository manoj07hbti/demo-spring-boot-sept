package com.example.demospringbootsept.service;

import com.example.demospringbootsept.model.Person;
import com.example.demospringbootsept.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public String add(Person person){

        repository.save(person);
        return "Person Data Save In To Database";
    }

    public List<Person> getAll(){
        return repository.findAll();
    }

    public String update(long id,String name){
        Person person=repository.getById(id);
        person.setName(name);
        repository.save(person);
        return "Person record updated successfully";
    }

    public String delete(long id){
        repository.deleteById(id);
        return "Person data delete successfully";
    }
}
