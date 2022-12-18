package com.onesolvent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesolvent.entity.Employee;
import com.onesolvent.service.EmployeeService;

@RestController
@RequestMapping("/restapi")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;

	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id){
		
		return employeeService.findById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteById(@PathVariable int id){
		
		employeeService.deleteById(id);
	}
	
	@PostMapping("/employee")
	public void save(@RequestBody Employee employee){
		
		employeeService.save(employee);
	}
	
	@PutMapping("/employee")
	public void update(@RequestBody Employee employee){
		
		employeeService.save(employee);
	}
	

}
