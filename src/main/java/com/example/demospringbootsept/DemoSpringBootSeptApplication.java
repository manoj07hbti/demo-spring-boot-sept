package com.example.demospringbootsept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class DemoSpringBootSeptApplication {

	public static void main(String[] args) {
		System.out.println("Setting the timezone"+ TimeZone.getTimeZone("GMT+9:00").getID());
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+9:00"));
		SpringApplication.run(DemoSpringBootSeptApplication.class, args);
	}

}
