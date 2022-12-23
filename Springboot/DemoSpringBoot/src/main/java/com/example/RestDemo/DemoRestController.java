package com.example.RestDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String getResponse() {
		return "Hello World! Time on server is : "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String doWorkout() {
		return "Run 5Kms daily!!";
		
	}
	
	

}
