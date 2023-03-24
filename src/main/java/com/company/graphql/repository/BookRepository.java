package com.company.graphql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.graphql.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

	Optional<Book> findByTitleAndPrice(String title, Integer price);

}
