package com.sk.intensive.library.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Account;


@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long>,
                                           QuerydslPredicateExecutor<Account> {
	
	Account findByEmail(@Param("email") String email);
	List<Account> findByNameLike(@Param("name") String name);
	
	List<Account> findByAddressZipCode(@Param("zipCode") Integer zipCode);
	
	@Query("select a from Account a where a.address.homeAddress like %?1%")
	List<Account> findByAddressHomeAddressLike(@Param("homeAddress") String homeAddress);
	
	List<Account> findAll();
	List<Account> findAll(Predicate predicate); 
}
