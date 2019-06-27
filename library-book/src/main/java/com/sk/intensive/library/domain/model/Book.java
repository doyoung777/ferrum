package com.sk.intensive.library.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.sk.intensive.library.common.base.AbstractEntity;
import com.sk.intensive.library.common.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode (callSuper = true)
@Entity
public class Book extends AbstractEntity implements AggregateRoot {
	
	
	private String isbn;
	private	String title;
	private String author;
	private String publisher;
	
	@Enumerated(EnumType.STRING)
	private BookStatus bookstatus;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	public Book(String isbn, String title, String author, String publisher,Category category, BookStatus bookstatus) {
		
		this.isbn	= isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
		this.bookstatus = bookstatus;
		
	}

}