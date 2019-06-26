package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.intensive.library.domain.model.Book;

public interface BookService {
	
	List<Book> findAll();
	
	
	List<Book> searchBookIsbn(String isbn);
	List<Book> searchBookTitle(String title);
	List<Book> searchBookAuthor(String author);
	List<Book> searchBookPublisher(String publisher);
	
	void rentBook(Long bookid);
	void returnBook(Long bookid);
	void lostBook(Long bookid);
	
	void addBook(Book book);
	
	String getBookStatus(Long bookid);
	Book getBookInfo(Long bookid);
	

}
