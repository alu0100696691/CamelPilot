package com.camelpilot.camelpilot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
	
	
	@GetMapping("/")
	public String showLoginForm() {
		
		return "login";
	}

}
