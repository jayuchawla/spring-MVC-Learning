package com.jayu.learning.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Transfer data from Controller to JSP:
	//	1. Model
	//	2. ModelAndView	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("fname", "Jayu");
		model.addAttribute("lname", "Chawla");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView helpModelAndView = new ModelAndView();
		
		// setting the data
		helpModelAndView.addObject("contact", "1234567890");
		helpModelAndView.addObject("email", "ab@cd.com");
		
		// setting the view
		helpModelAndView.setViewName("help");
		
		return helpModelAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		List<String> products = new ArrayList<>(Arrays.asList("dashboards", "transaction sscreening","mobile apps"));
		ModelAndView aboutModelAndView = new ModelAndView();
		aboutModelAndView.addObject("products", products);
		aboutModelAndView.setViewName("about");
		return aboutModelAndView;
	}
}

