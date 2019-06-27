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
	public Page<Book> findAll(Pageable pageable) {
		return bookRepository.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Book getBookById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.getBookById(id);
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
	@Transactional
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	@Transactional
	public Book rentBook(long id) {
		Book book = bookRepository.getBookById(id);
		if(book != null) {
			book.setBookstatus(BookStatus.AC);
			return bookRepository.save(book);
		}
		else {
			return null;
		}
	}
	
	
	@Override
	@Transactional
	public Book returnBook(long id) {
		Book book = bookRepository.getBookById(id);
		if(book != null) {
			book.setBookstatus(BookStatus.AV);
			return bookRepository.save(book);
		}
		else {
			return null;
		}
	}

	@Override
	@Transactional
	public Book lostBook(long id) {
		Book book = bookRepository.getBookById(id);
		if(book != null) {
			book.setBookstatus(BookStatus.UN);
			return bookRepository.save(book);
		}
		else {
			return null;
		}
	}

	
}
