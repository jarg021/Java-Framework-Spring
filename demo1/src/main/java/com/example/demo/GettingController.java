package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GettingController {

	@RequestMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("name","Armando");
		return "greeting_template";
		
	}

}
