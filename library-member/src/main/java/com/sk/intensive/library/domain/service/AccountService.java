package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.intensive.library.domain.model.Account;

public interface AccountService {
	
	List<Account> findAll();
	Page<Account> findAll(Pageable pageable);
	
	List<Account> findByNameLike(String name);
	Account findByEmail(String email);
	
	Account register(Account account);

}
