package com.example.demospringbootsept.percentage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageNumber {

    @RequestMapping("/percent")
    public String percent(){

        String value="Percentage of value is.......";

        int hindi=76;
        int english=87;
        int drawing=97;
        int math=60;
        int social=85;
        int evs=58;
        double sum=(hindi+english+drawing+math+social+evs);
        int maximum=100*6;
        double percent=(sum*100)/maximum;
        value = value+percent;
        return value;

    }
}
