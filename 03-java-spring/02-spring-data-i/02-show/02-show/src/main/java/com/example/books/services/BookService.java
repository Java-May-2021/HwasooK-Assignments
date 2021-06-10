package com.example.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.books.models.Book;
import com.example.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bRepo;
	
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	
	public List<Book> getAllBooks() {
		return this.bRepo.findAll();
	}
	
	
	public Book getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book book) {
		return this.bRepo.save(book);
	}
	
	//Create book Manual Way
	public Book createBookTwo(String title, String description, String language, int numberOfPages) {
		 Book newBook = new Book(title, description, language, numberOfPages);
		 return this.bRepo.save(newBook);
		}

	
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}
	
	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}
	
}
