package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/getController")
	public String getController() {
		return "hello";
	}
	
	@RequestMapping("/getFromTemplate")
	public String getFromTemplate(Model model) {
		model.addAttribute("username","admin");
		model.addAttribute("email", "email@domain.com");
		return "getUserDetails";
	}
	

}
