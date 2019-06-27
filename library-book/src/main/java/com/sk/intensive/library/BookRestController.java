package com.sk.intensive.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.intensive.library.domain.model.Book;
import com.sk.intensive.library.domain.service.BookService;

@RestController
@RequestMapping("/v1/accounts")
public class BookRestController implements BookService {
	@Autowired
	private BookService bookservice;

	@Override
	@GetMapping
	public List<Book> findAll() {
		return bookservice.findAll(); 
	}

	@Override
	public List<Book> searchBookIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBookTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBookAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBookPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rentBook(Long bookid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnBook(Long bookid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lostBook(Long bookid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBookStatus(Long bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookInfo(Long bookid) {
		// TODO Auto-generated method stub
		return null;
	}



}
