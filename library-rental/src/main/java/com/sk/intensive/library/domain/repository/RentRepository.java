package com.sk.intensive.library.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Rent;


@RepositoryRestResource
public interface RentRepository extends PagingAndSortingRepository<Rent, Long>,
                                           QuerydslPredicateExecutor<Rent> {
	Rent getRentById(@Param("id") Long id);
	Rent getRentByMembernum(@Param("membernum") Long membernum);
	
}
