package com.bhawna.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {


	@GetMapping("/welcome")
	public String homeControllerdemo(Model model)
	{
		String msg=("Welcome");
		model.addAttribute("name", msg);
		return "home";
	}
}
