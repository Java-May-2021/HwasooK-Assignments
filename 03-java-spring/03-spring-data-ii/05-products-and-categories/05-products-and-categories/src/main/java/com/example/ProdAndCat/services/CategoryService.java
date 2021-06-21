package com.example.ProdAndCat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProdAndCat.models.Category;
import com.example.ProdAndCat.models.Product;
import com.example.ProdAndCat.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository cRepo;
	public CategoryService(CategoryRepository cRepo) {
		this.cRepo = cRepo;
	}
		
	//Display All
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	
	//Display One
	public Category getSingleCategroy(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public Category findCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//Create
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	//Not In Product
	public List<Category> findCategoriesNotInProduct(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
}