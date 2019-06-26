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
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public String getPublisher()
	{
		return this.getPublisher();
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public void setCategory(Category category)
	{
		this.category = category;
	}
	
	public void setBookStatus(BookStatus bookstatus)
	{
		this.bookstatus = bookstatus;
	}
}

