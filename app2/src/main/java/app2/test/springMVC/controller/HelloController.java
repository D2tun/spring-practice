package app2.test.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/0")
public class HelloController {

	@GetMapping("/hello-world")
	public String hello() {
		return "helloWorld";
	}
	
	@GetMapping("/hello")
	public String helloPage(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname, Model model) {
		//System.out.println("hello " + " " + name + " " + surname);
		model.addAttribute("message", "hello " + " " + name + " " + surname);
		return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodbyePage() {
		return "first/goodbye";
	}
}
