package com.example.dogs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dogs.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{

}
