package com.sk.intensive.library.domain.service;

import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Book;
import com.sk.intensive.library.domain.model.BookStatus;
import com.sk.intensive.library.domain.repository.BookRepository;

@Service("bookLogic")
public class BookLogic implements BookService {
	@Autowired
	private BookRepository bookRepository;

	
	@Override
	@Transactional(readOnly=true)
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
		
	@Override
	@Transactional(readOnly=true)
	public List<Book> searchBookIsbn(String isbn) {
		// ISBN으로 책 찾기
		return bookRepository.findByIsbn(isbn);
	}


	@Override
	@Transactional(readOnly=true)
	public List<Book> searchBookTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitle(title);
	}


	@Override
	@Transactional(readOnly=true)
	public List<Book> searchBookAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByAuthor(author);
	}


	@Override
	@Transactional(readOnly=true)
	public List<Book> searchBookPublisher(String publisher) {
		// TODO Auto-generated method stub
		return bookRepository.findByPublisher(publisher);
	}


	@Override
	public void rentBook(Long id) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findOne(id);
		book.setBookStatus(BookStatus.AC);
		bookRepository.save(book);
		
	}


	@Override
	public void returnBook(Long id) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findOne(id);
		book.setBookStatus(BookStatus.AV);
		bookRepository.save(book);
		
	}


	@Override
	public void lostBook(Long id) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findOne(id);
		book.setBookStatus(BookStatus.UN);
		bookRepository.save(book);
	}


	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getBookStatus(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findOne(id).getBookstatus().toString();
	}


	@Override
	public Book getBookInfo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
