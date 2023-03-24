package com.company.graphql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GenericGenerator(name = "book_id_generator", strategy = "com.company.graphql.generator.BookIdGenerator")
	@GeneratedValue(generator = "book_id_generator")
	@Column(name = "book_id")
	private String id;

	@Column(name = "book_title")
	private String title;

	@Column(name = "book_description")
	private String description;

	@Column(name = "book_price")
	private Integer price;

	@Column(name = "number_of_pages")
	private Integer pages;

}
