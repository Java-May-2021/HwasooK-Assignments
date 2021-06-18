package com.example.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogs.models.Toy;
import com.example.dogs.repositories.ToyRepository;

@Service
public class ToyService {
	@Autowired
	private ToyRepository tRepo;
	
	//create
	public Toy createToy(Toy toy) {
		return this.tRepo.save(toy);
	}
	
	//delete
	public void deleteToy(Long id) {
		this.tRepo.deleteById(id);
	}
}
