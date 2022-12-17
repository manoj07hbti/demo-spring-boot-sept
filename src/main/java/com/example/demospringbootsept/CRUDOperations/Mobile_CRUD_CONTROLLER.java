package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Mobile;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestAttributeMethodArgumentResolver;

import java.util.ArrayList;

@RestController
public class Mobile_CRUD_CONTROLLER {
    ArrayList<Mobile> getMobileDetail = new ArrayList<>();

    @RequestMapping(value = "/create_name", method = RequestMethod.POST)
    //TODO SYNTAX : ACCESS_SPECIFIER DATA_TYPE RETURN_TYPE (@REQUESTBODY DATA_TYPE RETURN_TYPE)
    public Mobile addDetail(@RequestBody Mobile detail) {
        getMobileDetail.add(detail);
        return detail;


    }

    @RequestMapping(value = "/read_data", method = RequestMethod.GET)
    public ArrayList<Mobile> getData() {
        return getMobileDetail;
    }

    @RequestMapping(value = "/update_colour", method = RequestMethod.PUT)
    public String updateData(@RequestParam int index, @RequestParam String colour) {
        Mobile updateColour = getMobileDetail.get(index);
        updateColour.setColour(colour);
        return "colour update successfully";


    }

    @RequestMapping(value = "/remove_data", method = RequestMethod.DELETE)
    public String remove(@RequestParam int index) {
        getMobileDetail.remove(index);
        return "delete data successfully";
    }
}
