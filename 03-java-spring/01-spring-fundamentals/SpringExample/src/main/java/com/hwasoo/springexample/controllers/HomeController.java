package com.hwasoo.springexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/addjoke", method=RequestMethod.POST)
	public String hello(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("joke") String joke, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("email", email);
		viewModel.addAttribute("joke", joke);

		return "showjoke.jsp";
	}
	
	@RequestMapping(value="/color/{color}", method=RequestMethod.GET)
	public String color(@PathVariable("color") String color, Model viewModel) {
		viewModel.addAttribute("color", color);
		return "favcolor.jsp";
	}
}
