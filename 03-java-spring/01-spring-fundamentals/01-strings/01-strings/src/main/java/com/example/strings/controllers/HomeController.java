package com.example.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping(value="/random", method=RequestMethod.GET)
	public String random() {
		return "STS is fun";
	}
}
