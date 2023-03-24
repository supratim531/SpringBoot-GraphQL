package com.company.graphql.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.graphql.entity.Book;
import com.company.graphql.repository.BookRepository;
import com.company.graphql.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return this.bookRepository.findAll();
	}

	@Override
	public Book createBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Override
	public Book getBookById(String id) {
		return this.bookRepository.findById(id).orElse(null);
	}

	@Override
	public Book getBookByTitleAndPrice(String title, Integer price) {
		return this.bookRepository.findByTitleAndPrice(title, price).orElse(null);
	}

}
