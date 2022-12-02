package com.example.demospringbootsept.path_variable_assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percent_number_path_variable {
    @RequestMapping("/percent/{marks}/{total}")
    public String percent(@PathVariable int marks,@PathVariable int total){

        String output="  ";

        int percent= marks*100/total;

        output ="percent-------->>"+percent;

        return output;
    }


}
