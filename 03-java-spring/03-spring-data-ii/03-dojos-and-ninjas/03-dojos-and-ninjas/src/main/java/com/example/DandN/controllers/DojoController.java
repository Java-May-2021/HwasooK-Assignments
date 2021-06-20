package com.example.DandN.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.DandN.models.Dojo;
import com.example.DandN.models.Ninja;
import com.example.DandN.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("/")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("allDojos", this.dService.getAllDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String addDojo(@RequestParam("name") String name, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
//		if(name.length() < 2 ) {
//			errors.add("please provide a longer Dojo name");
//		}
//		if(name.length() > 20 ) {
//			errors.add("please provide a shorter Dojo name");
//		}
		if(errors.size() > 0) {
				redirectAttr.addFlashAttribute("errors", errors);
				return "redirect:/dojo/new";
			}
		this.dService.createDojoManually(name);
		return "redirect:/";
	}
	@GetMapping("dojo/{id}")
	public String viewDojo(@ModelAttribute("dojo") Dojo dojo, Model model, @PathVariable("id") Long id) {
		Dojo oneDojo = this.dService.findDojo(id);
		model.addAttribute("dojo", oneDojo);
		return "viewDojo.jsp";
	}
	

	
	
	@RequestMapping("/ninja/new")
	public String New(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.dService.getAllDojos());
		return "newNinja.jsp";
	}
	@RequestMapping(value="/ninja/create", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.dService.getAllDojos());
			return "newNinja.jsp";
		}
		this.dService.createNinja(ninja);
		return "redirect:/";
	}
}