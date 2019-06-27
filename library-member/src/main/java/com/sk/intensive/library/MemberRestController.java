package com.sk.intensive.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.intensive.library.domain.model.Address;
import com.sk.intensive.library.domain.model.Member;
import com.sk.intensive.library.domain.service.MemberService;

@RestController
@RequestMapping("/v1/library-member")
public class MemberRestController implements MemberService {

	@Autowired
	private MemberService memberService; 
	
	@Override
	@GetMapping
	public List<Member> findAll() {
		return memberService.findAll();
	}
	
	@Override
	@GetMapping("/search/id")
	public Member getMemberById(long id) {
		return memberService.getMemberById(id);
	}

	@Override
	@GetMapping("/search/name")
	public Member getMemberByName(String name) {
		return memberService.getMemberByName(name);
	}

	@Override
	@GetMapping("/search/email")
	public Member getMemberByEmail(String email) {
		return memberService.getMemberByEmail(email);
	}
	
	@Override
	@PostMapping
	public void register(@RequestBody Member member) {
		memberService.register(member);
	}

	@Override
	@PutMapping("/updatge/name")
	public Member setName(long id, String name) {
		return memberService.setName(id, name);
	}

	@Override
	@PutMapping("/updatge/email")
	public Member setEmail(long id, String email) {
		return memberService.setEmail(id, email);
	}

	@Override
	@PutMapping("/updatge/address")
	public Member setAddress(long id, Address address) {
		return memberService.setAddress(id, address);
	}

	/*
	@Override
	@GetMapping("/login")
	public String login(String loginId, String password) {
		return memberService.login(loginId, password);
	}
	*/

}
