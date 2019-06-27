package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Address;
import com.sk.intensive.library.domain.model.Member;

public interface MemberService {
	
	/* 전체 조회 */
	List<Member> findAll();
	
	/* 단건 조회 */
	Member getMemberById(long id);
	Member getMemberByName(String name);
	Member getMemberByEmail(String email);
	
	/* 등록 */
	void register(Member member);
	
	/* 변경 */
	Member setName(long memberNum, String name);
	Member setEmail(long memberNum, String email);
	Member setAddress(long memberNum, Address address);
	
	/* 로그인 */
	//String login(String loginId, String password);
}
