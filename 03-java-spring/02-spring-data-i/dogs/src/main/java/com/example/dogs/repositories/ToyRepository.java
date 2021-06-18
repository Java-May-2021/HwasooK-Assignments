package com.example.dogs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dogs.models.Toy;

@Repository
public interface ToyRepository extends CrudRepository<Toy, Long> {

}
