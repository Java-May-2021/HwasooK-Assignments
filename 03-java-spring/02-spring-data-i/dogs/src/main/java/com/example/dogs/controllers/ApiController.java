package com.example.dogs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dogs.models.Dog;
import com.example.dogs.services.DogService;

@RestController
@RequestMapping("/api")
public class ApiController { //inject DogService into here
	@Autowired
	private DogService dService;
	
	@GetMapping("")
	public List<Dog> getDogs() {
		return this.dService.getAllDogs();
	}
	
	@GetMapping("/{id}")
	public Dog getSingle(@PathVariable("id") Long id) {
		return this.dService.getSingleDog(id);
	}
	
	@PostMapping("/create")
	public Dog createDog(Dog newDog) {
		return this.dService.createDog(newDog);
	}
	
	@PutMapping("/update/{id}") 
	public Dog edit(@PathVariable("id") Long id, Dog updateDog) {
		return this.dService.updateDog(updateDog);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.dService.deleteDog(id);
	}
	
}
