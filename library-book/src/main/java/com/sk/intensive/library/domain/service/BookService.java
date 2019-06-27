package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.intensive.library.domain.model.Book;

public interface BookService {
	
	List<Book> findAll();
	Page<Book> findAll(Pageable pageable);
	Book getBookById(long id);
		
	List<Book> searchBookIsbn(String isbn);
	List<Book> searchBookTitle(String title);
	List<Book> searchBookAuthor(String author);
	List<Book> searchBookPublisher(String publisher);
	
	void addBook(Book book);
	Book rentBook(long id);
	Book returnBook(long id);
	Book lostBook(long id);
		
	
	
}
