package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MobileCRUD_Controller {

    ArrayList<Mobile> mobilesArrayList = new ArrayList<>();

    @RequestMapping(value = "/add_mobile", method = RequestMethod.POST)
    public Mobile addMobile(@RequestBody Mobile mobile) {

        mobilesArrayList.add(mobile);
        return mobile;
    }

    @RequestMapping(value = "/get_mobile", method = RequestMethod.GET)
    public ArrayList<Mobile> getInfo() {

        return mobilesArrayList;
    }

    @RequestMapping(value = "/update_mobile/{index}/{company}", method = RequestMethod.PUT)
    public String updateMobile(@PathVariable int index, @PathVariable String company) {


        Mobile mobile = mobilesArrayList.get(index);
        mobile.setCompany(company);

        return "  info Updated Successfully.....";
    }

    @RequestMapping(value = "/remove_mobile", method = RequestMethod.DELETE)
    public String removeMobile(@RequestParam int index) {

        mobilesArrayList.remove(index);

        return "emp deleted successfully...";
    }


}
