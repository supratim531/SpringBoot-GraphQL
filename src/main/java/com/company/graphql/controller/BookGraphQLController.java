package com.company.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.company.graphql.entity.Book;
import com.company.graphql.model.BookInput;
import com.company.graphql.service.BookService;

@Controller
public class BookGraphQLController {

	@Autowired
	private BookService bookService;

	@QueryMapping("fetchAllBooks")
	public List<Book> getAllBooks() {
		return this.bookService.getAllBooks();
	}

	@QueryMapping("fetchBookById")
	public Book getBookById(@Argument String id) {
		return this.bookService.getBookById(id);
	}

	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput bookInput) {
		Book book = Book.builder().title(bookInput.getTitle()).description(bookInput.getDescription())
				.price(bookInput.getPrice()).pages(bookInput.getPages()).build();
		return this.bookService.createBook(book);
	}

	@QueryMapping("fetchBookByTitleAndPrice")
	public Book getBookByTitleAndPrice(@Argument String title, @Argument Integer price) {
		return this.bookService.getBookByTitleAndPrice(title, price);
	}

}
