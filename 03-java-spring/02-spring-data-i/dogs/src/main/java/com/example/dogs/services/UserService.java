package com.example.dogs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogs.models.Dog;
import com.example.dogs.models.User;
import com.example.dogs.repositories.DogRepository;
import com.example.dogs.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	@Autowired
	private DogRepository dRepo;
	
	//Get all users
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	
	public User getSingleUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	//like
	public void likeDog(User user, Dog dog) {
		List<User> usersWhoHaveLiked = dog.getLikers();
		usersWhoHaveLiked.add(user);
		this.dRepo.save(dog);
	}
	
	//Unlike
	public void unlikeDog(User user, Dog dog) {
		List<User> usersWhoHaveLiked = dog.getLikers();
		usersWhoHaveLiked.remove(user);
		this.dRepo.save(dog);
	}
}
