package com.onesolvent.service;

import java.util.List;

import com.onesolvent.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void deleteById(int id);
	
	public void save(Employee e);


}
