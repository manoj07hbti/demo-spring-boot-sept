package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Draculla;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Demo_Draculla {

    ArrayList<Draculla> drac=new ArrayList<>();

    @RequestMapping(value = "/posting_draculla", method = RequestMethod.POST)  //for adding.....
    public Draculla create(@RequestBody Draculla ddddd){
        drac.add(ddddd);
        return ddddd;
    }
    @RequestMapping(value = "/getting_draculla", method = RequestMethod.GET)  //for reading.....
    public ArrayList<Draculla> getting(){
        return drac;

    }
    @RequestMapping(value = "/putting_draculla", method = RequestMethod.PUT) //for editing
    public String putting(@RequestParam int index,@RequestParam int teethsize){
        Draculla obj= drac.get(index);
        obj.setTeethsize(teethsize);
        return "danto ka size badal chuka hai";
    }
    @RequestMapping(value = "/deleitng_draculla",method = RequestMethod.DELETE)//for delete...
    public String deleting(@RequestParam int index){
        drac.remove(index);
        return "dracula ho gya successfully delete";
    }
}
