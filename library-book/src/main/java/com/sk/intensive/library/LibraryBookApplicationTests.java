package com.sk.intensive.library;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.sk.intensive.library.domain.model.Book;
import com.sk.intensive.library.domain.model.BookStatus;
import com.sk.intensive.library.domain.model.Category;
import com.sk.intensive.library.domain.repository.BookRepository;


@SpringBootApplication
public class LibraryBookApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(LibraryBookApplicationTests.class, args);
	}
	
//	@Bean
//	public CommandLineRunner execSampleCode(BookRepository bookRepository) {	
//		return (args) -> {
//			insertProducts(bookRepository);
//			displayProducts(bookRepository);
//			
//		};
//	}
//
//
//	private void displayProducts(BookRepository bookRepository) {
//		// TODO Auto-generated method stub
//		System.out.println("***************************************************************");
//		
//		Iterable<Book> bookList = bookRepository.findAll();
//		for(Book book : bookList) {
//			System.out.println(book.toString());	
//		}
//		
//		System.out.println("***************************************************************");
//	}
//
//
//	private void insertProducts(BookRepository bookRepository) {
//		// TODO Auto-generated method stub
//		// Book(String isbn, String title, String author, String publisher,Category category, BookStatus bookstatus)
//		Book book1 = new Book("ISBN_001","여행의 이유(바캉스 에디션)","	","문학동네",Category.FICTION,BookStatus.AV);
//		bookRepository.save(book1);
//		
//		Book book2 = new Book("ISBN_002","죽음","베르나르 베르베르","열린책들",Category.FICTION,BookStatus.AV);
//		bookRepository.save(book2);
//		
//		Book book3 = new Book("ISBN_003","50대 사건으로 보는 돈의 역사","홍춘욱","로크미디어",Category.NON_FICTION,BookStatus.AV);
//		bookRepository.save(book3);
//		
//	}
}
