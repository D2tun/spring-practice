package app2.test.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello-world")
	public String hello() {
		return "helloWorld";
	}
	
}
