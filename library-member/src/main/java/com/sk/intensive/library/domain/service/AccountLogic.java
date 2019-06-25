package com.sk.intensive.library.domain.service;

import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Account;
import com.sk.intensive.library.domain.repository.AccountRepository;

@Service("accountLogic")
public class AccountLogic implements AccountService {
	@Autowired
	private AccountRepository accountRepository;


	@Override
	@Transactional(readOnly=true)
	public List<Account> findByNameLike(String name) {
		return accountRepository.findByNameLike(name);
	}

	@Override
	@Transactional(readOnly=true)
	public Account findByEmail(String email) {
		return accountRepository.findByEmail(email);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	
	@Override
	@Transactional(readOnly=true)
	public Page<Account> findAll(Pageable pageable) {
		return accountRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public Account register(Account account) {
		return accountRepository.save(account);
	}

	
}
