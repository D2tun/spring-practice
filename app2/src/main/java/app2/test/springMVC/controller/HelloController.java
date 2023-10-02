package app2.test.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/0")
public class HelloController {

	@GetMapping("/hello-world")
	public String hello() {
		return "helloWorld";
	}
	
	@GetMapping("/hello")
	public String helloPage() {
		return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodbyePage() {
		return "first/goodbye";
	}
}
