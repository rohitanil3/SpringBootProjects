package com.onesolvent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onesolvent.dao.EmployeeRepository;
import com.onesolvent.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		 Optional<Employee> optional = repository.findById(id);
		 return optional.get();
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	@Transactional
	public void save(Employee e) {
		// TODO Auto-generated method stub
		repository.save(e);
		
	}

}
