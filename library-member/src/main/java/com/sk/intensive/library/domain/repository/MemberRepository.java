package com.sk.intensive.library.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Member;


@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long>,
                                           QuerydslPredicateExecutor<Member> {
	
	List<Member> findAll();
	List<Member> findAll(Predicate predicate);
	
	Member getMemberById(@Param("id") long id);
	Member getMemberByName(@Param("name") String name);
	Member getMemberByEmail(@Param("email")String email);
	
}

