package app3.test.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/simpleCalc")
public class CalcController {

	@GetMapping("/calculation")
	public String calculate (@RequestParam(value = "a", required = false) Double a, @RequestParam(value = "op", required = false) String op, @RequestParam(value = "b", required = false) Double b, Model model) {
		try {
			if (a.equals(null) | b.equals(null) | op.isBlank()) {
				model.addAttribute("message", "");
			}
			switch (op) {
			case "add":
				model.addAttribute("message", a + " + " + b + " = " + (a + b));
				break;
			case "sub":
				model.addAttribute("message", a + " - " + b + " = " + (a - b));
				break;
			case "mul":
				model.addAttribute("message", a + " * " + b + " = " + (a * b));
				break;
			case "div":
				model.addAttribute("message", a + " / " + b + " = " + (a / b));
				break;
			default:
				model.addAttribute("message", "invalid operator");
				break;
			} 
			return "/simpleCalc";
		} catch (Exception e) {
			model.addAttribute("message", "calculation error");
			return "/simpleCalc";
		}
	}
}
