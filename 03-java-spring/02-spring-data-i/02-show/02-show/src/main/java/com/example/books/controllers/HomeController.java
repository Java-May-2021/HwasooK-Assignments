package com.example.books.controllers;

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

import com.example.books.models.Book;
import com.example.books.services.BookService;

@Controller
public class HomeController {
	 @Autowired
	 private BookService bService;

	 @GetMapping("/")
	 public String dashboard(Model viewModel) {
		 viewModel.addAttribute("allBooks", this.bService.getAllBooks()); 
		 return "dashboard.jsp";
	 }
	
	 @GetMapping("/add")
	 public String add(@ModelAttribute("book") Book book) {
		 return "new.jsp";
	 }

	 @PostMapping("/add")
	 public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	  if(result.hasErrors()) {
	   return "new.jsp";
	  }
	  this.bService.createBook(book);
	  return "redirect:/";
	 }


	 @PostMapping("/htmlway")       // bringing data from new.jsp
	 public String addBookHTML(@RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("language") String language, @RequestParam("numberOfPages") int numberOfPages, RedirectAttributes redirectAttr) {
		 ArrayList<String> errors = new ArrayList<String>();
			if(title.equals("")) {
				errors.add("Hey there, don’t forget to add a name");
			}
			if(errors.size() > 0) {
				for(String e: errors) {
					redirectAttr.addFlashAttribute("errors", e);
				}
				return "redirect:/add";
			}
		 this.bService.createBookTwo(title, description, language, numberOfPages);
		 return "redirect:/";
	 }

}
