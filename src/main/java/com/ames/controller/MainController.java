package com.ames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/ames")
	public String home() {
		return "Hello, Welcome to AEMS home page!";
	}
	
	@GetMapping("/ames/tocken")
	public int getToken() {
		return 777;
	}
	
}
