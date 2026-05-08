package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/")
	public String getIndex() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index.html";
	}

}
