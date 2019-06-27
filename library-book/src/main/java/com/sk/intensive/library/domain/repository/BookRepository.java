package com.sk.intensive.library.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Book;


@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Long>,
                                           QuerydslPredicateExecutor<Book> {
	Book findOne(Long id);
	List<Book> findAll();
	List<Book> findAll(Predicate predicate);
	
	List<Book> findByIsbn(@Param ("isbn") String isbn);
	List<Book> findByTitle(@Param ("title") String title);
	List<Book> findByAuthor(@Param ("author") String author);
	List<Book> findByPublisher(@Param ("publisher") String publisher);
	List<Book> findByCategory(@Param ("category") String category);
	
	
	
	
	
	
	
	 
}
