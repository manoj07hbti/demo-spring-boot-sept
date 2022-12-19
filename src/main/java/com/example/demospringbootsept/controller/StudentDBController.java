package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Student;
import com.example.demospringbootsept.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;


    //CRUD
    //CREATE
    @PostMapping("/add_std_db") // @RequestMapping(value = "/add_student",method = RequestMethod.POST)
    public String addStudent(@RequestBody Student student){

        return service.add(student);

    }

    //READ
    @GetMapping("/get_all_std")// @RequestMapping(value = "/get_students", method = RequestMethod.GET)
    public List<Student> getAll(){

      return   service.getAllStd();
    }

    //UPDATE

    @PutMapping("/update_std_db/{roll_no}/{name}") //@RequestMapping(value = "/update_student/{index}/{name}", method = RequestMethod.PUT)
    public String update(@PathVariable long roll_no,@PathVariable String name){

        return service.update(roll_no,name);

    }

    //Delete

    @DeleteMapping("/delete_std_db/{roll_no}")// @RequestMapping(value = "/remove_student", method = RequestMethod.DELETE)
    public String delete(@PathVariable long roll_no){

        return service.delete(roll_no);
    }

    @GetMapping("/find_by_rollno")
    public Student getStudent(@RequestParam long roll_no){

       return service.getStudentByRollno(roll_no);

    }

    @GetMapping("/find_by_name")
    public Student getStudent(@RequestParam String name){

        return service.getStudentByName(name);

    }


    @GetMapping("/find_by_name_rollno")
    public Student getStudentByNameRollNo(@RequestParam String name, @RequestParam long rollNo){

        return service.getStudentByNameAndRollNo(name,rollNo);

    }

    @GetMapping("/find_by_query")
    public Student getStudentByQuery(@RequestParam String name, @RequestParam long rollNo){

        return service.getStudentByQuery(name,rollNo);

    }

    @GetMapping("/findall_by_query")
    public List <Student> getAllStudent(@RequestParam  String section){

        return service.getAllStudentQuery(section);

    }

}
