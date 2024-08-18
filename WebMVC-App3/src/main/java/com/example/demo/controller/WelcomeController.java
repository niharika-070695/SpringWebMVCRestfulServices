package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/mechanicsberg")
	public ModelAndView welcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to Mechanicsberg");
		mav.setViewName("mechanicsberg");
		return mav;
	}

}
