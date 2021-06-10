package com.example.dogs.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dogs.models.Dog;
import com.example.dogs.services.DogService;

@Controller
public class HomeController {
	@Autowired
	private DogService dService;
	
	@GetMapping("/")
	public String dashboard(Model viewModel) {//taking data from backend, then display frontend
		viewModel.addAttribute("allDogs", this.dService.getAllDogs());
		return "dashboard.jsp";
	}
	
	
	@GetMapping("/add")
	public String add(@ModelAttribute("dog") Dog dog) {
		return "new.jsp";
	}
	
	@PostMapping("/add")
	public String addDog(@Valid @ModelAttribute("dog") Dog dog, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.dService.createDog(dog);
		return "redirect:/";
	}
	
	@PostMapping("/htmlway")   // bringing data from new.jsp
	public String addDogHTML(@RequestParam("name") String name, @RequestParam("breed") String breed, @RequestParam("age") int age, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("Hey there, don’t forget to add a name");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
				redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/add";
		}
		this.dService.createDogTwo(name, breed, age);
		return "redirect:/";
	}
	
	
}
