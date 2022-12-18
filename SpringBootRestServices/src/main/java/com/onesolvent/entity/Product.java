package com.onesolvent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Product_Tbl")
public class Product {
	
	@Id
    @GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	

}
