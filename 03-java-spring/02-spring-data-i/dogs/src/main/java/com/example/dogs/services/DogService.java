package com.example.dogs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dogs.models.Dog;
import com.example.dogs.repositories.DogRepository;

@Service
public class DogService {//injecting DogRepo into DogService
	private final DogRepository dRepo;
	
	public DogService(DogRepository repo) {
		this.dRepo = repo;
	}
	
	// Display all
	public List<Dog> getAllDogs(){
		return this.dRepo.findAll();
	}
	// Display one
	public Dog getSingleDog(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	//Create
	public Dog createDog(Dog dog) {
		return this.dRepo.save(dog);
	}
	//create manuall way
	public Dog createDogTwo(String name, String breed, int age) {
		Dog newDog = new Dog(name, breed, age);
		return this.dRepo.save(newDog);
	}
	
	//delete
	public void deleteDog(Long id) {
		this.dRepo.deleteById(id);
	}
	//Update
	public Dog updateDog(Dog dog) {
		return this.dRepo.save(dog);
	}
}
