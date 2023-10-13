package com.springDataJPA.springWebApp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/0")
@Component
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHi() {
		return "hi";
	}

}
