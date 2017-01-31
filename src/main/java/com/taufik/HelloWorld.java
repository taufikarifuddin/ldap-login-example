package com.taufik;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
	
	@GetMapping("/")
	public String test(Model model){
		
		return "index";
	}
	
}
