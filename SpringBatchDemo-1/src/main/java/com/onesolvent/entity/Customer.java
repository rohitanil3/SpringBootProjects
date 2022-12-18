package com.onesolvent.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer_info")
public class Customer {
	
	int id;
	
	String name;
	
	String lname;
	
	

}
