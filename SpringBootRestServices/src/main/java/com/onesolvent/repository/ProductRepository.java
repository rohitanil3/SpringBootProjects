package com.onesolvent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onesolvent.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Product findByName(String name);
}
