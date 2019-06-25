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

import com.sk.intensive.library.domain.model.Account;
import com.sk.intensive.library.domain.service.AccountService;

@RestController
@RequestMapping("/v1/accounts")
public class AccountRestController implements AccountService {
	@Autowired
	private AccountService accountService;

	@Override
	@GetMapping
	public List<Account> findAll() {
		return accountService.findAll(); 
	}
	


	@Override
	@PostMapping
	public Account register(@RequestBody Account account) {
		return accountService.register(account);
	}

	
	@Override
	@GetMapping("/search/name")
	public List<Account> findByNameLike(@RequestParam("name") String name) {
		return accountService.findByNameLike(name);
	}

	@Override
	@GetMapping("/search/email")
	public Account findByEmail(@RequestParam("email") String email) {
		return accountService.findByEmail(email);
	}

	@Override
	//@GetMapping
	public Page<Account> findAll(Pageable pageable) {
		return accountService.findAll(pageable); 
	}


}
