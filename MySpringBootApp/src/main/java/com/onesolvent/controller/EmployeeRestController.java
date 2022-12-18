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

import com.onesolvent.dao.EmployeeDAO;
import com.onesolvent.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeRestController(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		
		return employeeDAO.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id){
		
		return employeeDAO.findById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteById(@PathVariable int id){
		
		 employeeDAO.deleteById(id);
	}
	
	@PostMapping("/employee")
	public void save(@RequestBody Employee employee){
		
		 employeeDAO.save(employee);
	}
	
	@PutMapping("/employee")
	public void update(@RequestBody Employee employee){
		
		 employeeDAO.save(employee);
	}
	

}
