package com.example.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogs.models.Tag;
import com.example.dogs.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	// create
	public Tag createTag(Tag newTag) {
		return this.tRepo.save(newTag);
	}
}
