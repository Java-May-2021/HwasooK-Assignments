package com.example.dogs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dogs.models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
	List<Dog> findAll();  //SELECT * FROM dogsmay.dogs
}
