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
@RequestMapping("/v1/library-book")
public class BookRestController implements BookService {
	
	@Autowired
	private BookService bookservice;

	@Override
	@GetMapping
	public List<Book> findAll() {
		return bookservice.findAll(); 
	}
	
	@Override
	public Page<Book> findAll(Pageable pageable) {
		return bookservice.findAll(pageable);
	}
	
	@Override
	@GetMapping("/search/id")
	public Book getBookById(long id) {
		  return bookservice.getBookById(id);
	}
	
	@Override
	@GetMapping("/search/isbn")
	public List<Book> searchBookIsbn(String isbn) {
		// TODO Auto-generated method stub
		return bookservice.searchBookIsbn(isbn);
	}

	@Override
	@GetMapping("/search/title")
	public List<Book> searchBookTitle(String title) {
		// TODO Auto-generated method stub
		return bookservice.searchBookTitle(title);
	}

	@Override
	@GetMapping("/search/author")
	public List<Book> searchBookAuthor(String author) {
		// TODO Auto-generated method stub
		return bookservice.searchBookAuthor(author);
	}

	@Override
	@GetMapping("/search/publisher")
	public List<Book> searchBookPublisher(String publisher) {
		// TODO Auto-generated method stub
		return bookservice.searchBookPublisher(publisher);
	}

	@Override
	@PutMapping("/update/rent")
	public Book rentBook(long id) {
		// TODO Auto-generated method stub
		return bookservice.rentBook(id);
		
	}

	@Override
	@PutMapping("/update/return")
	public Book returnBook(long id) {
		// TODO Auto-generated method stub
		return bookservice.rentBook(id);
		
	}

	@Override
	@PutMapping("/update/lost")
	public Book lostBook(long id) {
		return bookservice.lostBook(id);
		
	}


	@Override
	@PostMapping
	public void addBook(@RequestBody Book book) {
		bookservice.addBook(book);
	}




}
