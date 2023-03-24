package com.company.graphql.service;

import java.util.List;

import com.company.graphql.entity.Book;

public interface BookService {

	public List<Book> getAllBooks();

	public Book createBook(Book book);

	public Book getBookById(String id);

	public Book getBookByTitleAndPrice(String title, Integer price);

}
