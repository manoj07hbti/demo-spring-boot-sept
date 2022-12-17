package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Student1;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathCRUDController {
    ArrayList<Student1> student1ArrayList=new ArrayList<>();
    @RequestMapping("/std")
    public Student1 addstudents (@RequestBody Student1 students) {//REQUEST BODY +MODAL+ METHOD NAME
        student1ArrayList.add(students);
        return students;
    }



    @RequestMapping("/Student")
    public ArrayList<Student1> getData() {

        return student1ArrayList;
    }
    @RequestMapping("/update_student")
    public String updateSDetail(@RequestParam int index,@RequestParam String name ){       //we have to make setter methode for update data
        Student1 student=student1ArrayList.get(index);
        student.setName(name);
        return"Name update successfully";
    }
    @RequestMapping("/remove_detail")
    public String  removeStudent(@RequestParam int index){
        student1ArrayList.remove(index);
        return "successfully deleted";


    }
}

