package com.bhawna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homeControllerdemo(Model model)
	{
		String msg=("Hello world !");
		model.addAttribute("name", msg);
		return "home";
	}
}

