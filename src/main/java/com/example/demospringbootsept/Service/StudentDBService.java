package com.example.demospringbootsept.Service;

import com.example.demospringbootsept.Repository.StudentDBRepository;
import com.example.demospringbootsept.model1.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentDBService {
    @Autowired
    StudentDBRepository repository;
    public String add(Student1 student){
        repository.save(student);
        return "Name Addded succesfully ";
    }
    public List<Student1> get(){
        return repository.findAll();

    }
    public String update(long roll_no, String name){
        Student1 student=repository.getById(roll_no);
        student.setName(name);
        repository.save(student);
        return "Name Change Successfully";
    }
    public String remove( long roll_no){
        repository.deleteById(roll_no);
        return "name delete successfully";
    }
    public Student1 findByName( String name){
        return repository.findByName(name);
    }
}
