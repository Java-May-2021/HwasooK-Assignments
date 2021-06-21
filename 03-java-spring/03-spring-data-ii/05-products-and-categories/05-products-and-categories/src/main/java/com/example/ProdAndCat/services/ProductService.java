package com.example.ProdAndCat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProdAndCat.models.Category;
import com.example.ProdAndCat.models.Product;
import com.example.ProdAndCat.repositories.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	//Display All
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	//Display One
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public Product findProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//Create
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	//Not In Product
	public List<Product> findProductsNotInCategory(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	//Associate
	public void addCategoryToProduct(Product product, Category category) {
		List<Category> selectedCategories = product.getCategories();
		selectedCategories.add(category); 
		this.pRepo.save(product);
	}	
	
}
