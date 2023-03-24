package com.company.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.graphql.entity.Book;
import com.company.graphql.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/fetch-all")
	public List<Book> getAllBooks() {
		return this.bookService.getAllBooks();
	}

	@PostMapping("/add")
	public Book createBook(@RequestBody Book book) {
		return this.bookService.createBook(book);
	}

	@GetMapping("/fetch/{id}")
	public Book getBookById(@PathVariable String id) {
		return this.bookService.getBookById(id);
	}

}
