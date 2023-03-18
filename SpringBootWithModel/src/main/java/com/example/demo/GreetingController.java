package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class GreetingController {
	@GetMapping("/greeting")
	public String greeting() {
		return "Hello World!";
	}
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1,"venki");

	}
	
	@GetMapping("/employees")
	public Employee getEmployees(@RequestParam(value = "name", defaultValue = "World") String empname) {
		return new Employee(1,empname);

	}
}
