package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Value("${sport}")
	private String sport;
	
	@Value("${player}")
	private String player;
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello SpringBoot!";
	}
	
	@GetMapping("/prop")
	public String prop() {
		return "sport "+sport+" "+player;
	}

}
