package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController   
@RequestMapping(path="/demo")
public class MainController {
	@Autowired 
	private UserRepository userRepository;
	
	@PutMapping(path="/add") 
	public @ResponseBody String addEmp (@RequestBody Employee emp) {	
		System.out.println("Addding");
		userRepository.save(emp);
		return "Saved";
	}
	
	@GetMapping(path="/Employees")
	public @ResponseBody Iterable<Employee> getAllUsers() {	
	//odata v2/ v4 specification
		//enable filter
		//enable select
		//all other features
		return userRepository.findAll();
	}
	/*public @ResponseBody String getAllUsers() {		
		return "Hello";
	}*/
}