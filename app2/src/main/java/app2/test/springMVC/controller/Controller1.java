package app2.test.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/1")
public class Controller1 {
	
	@GetMapping("/exit")
	public String exit() {
		return "1/exit";
	}

}
