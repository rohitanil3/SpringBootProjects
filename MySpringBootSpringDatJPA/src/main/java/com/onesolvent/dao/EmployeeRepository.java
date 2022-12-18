package com.onesolvent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.onesolvent.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
