package com.example.dogs.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dogs.models.Dog;
import com.example.dogs.models.Tag;
import com.example.dogs.models.User;
import com.example.dogs.services.DogService;
import com.example.dogs.services.TagService;
import com.example.dogs.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private DogService dService;
	@Autowired
	private TagService tService;
	@Autowired
	private UserService uService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("users", this.uService.getAllUsers());
		return "landing.jsp";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("thisUser") Long userId, HttpSession session) {
		session.setAttribute("user__id", userId);
		return "redirect:/dogs";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/dogs")
	public String dashboard(Model viewModel, HttpSession session) {//taking data from backend, then display frontend
		viewModel.addAttribute("allDogs", this.dService.getAllDogs());
		viewModel.addAttribute("user", this.uService.getSingleUser((Long) session.getAttribute("user__id")));
		return "dashboard.jsp";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("tag") Tag tag) {
		Dog dogToShow = this.dService.getSingleDog(id);
		viewModel.addAttribute("dog", dogToShow);
		return "show.jsp";
	}
	
	@GetMapping("/like/{id}")    //not post mapping because data is already in DB. user is not adding anything new
	public String like(@PathVariable("id") Long id, HttpSession session) {
		Dog dogThatsLiked = this.dService.getSingleDog(id);
		User personWhoLiked = this.uService.getSingleUser((Long) session.getAttribute("user__id"));
		this.uService.likeDog(personWhoLiked, dogThatsLiked);
		return "redirect:/dogs";
	}
	
	@GetMapping("/unlike/{id}")    //not post mapping because data is already in DB. user is not adding anything new
	public String unlike(@PathVariable("id") Long id, HttpSession session) {
		Dog dogThatsLiked = this.dService.getSingleDog(id);
		User personWhoLiked = this.uService.getSingleUser((Long) session.getAttribute("user__id"));
		this.uService.unlikeDog(personWhoLiked, dogThatsLiked);
		return "redirect:/dogs";
	}
	
	@PostMapping("/tag/{id}")
	public String addTag(@Valid @ModelAttribute("tag") Tag tag, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		Dog dogToShow = this.dService.getSingleDog(id);
		if(result.hasErrors()) {
			
			viewModel.addAttribute("dog", dogToShow);
			return "show.jsp";
		}
		tag.setDog(dogToShow);
		this.tService.createTag(tag);
		return "redirect:/show/{id}";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("dog", this.dService.getSingleDog(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String editDog(@Valid @ModelAttribute("dog") Dog dog, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("dog", this.dService.getSingleDog(id));
			return "edit.jsp";
		}
		this.dService.updateDog(dog);
		return "redirect:/show/{id}";
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
