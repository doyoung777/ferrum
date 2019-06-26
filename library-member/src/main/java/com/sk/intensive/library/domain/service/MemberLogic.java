package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.intensive.library.domain.model.Address;
import com.sk.intensive.library.domain.model.Member;
import com.sk.intensive.library.domain.repository.MemberRepository;

@Service("memberLogic")
public class MemberLogic implements MemberService {

	@Autowired
	private MemberRepository memberRepository; 
	
	@Override
	@Transactional(readOnly=true)
	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Member> findAll(Pageable pageable) {
		return memberRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Member getMemberById(long id) {
		return memberRepository.getMemberById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Member getMemberByName(String name) {
		return memberRepository.getMemberByName(name);
	}

	@Override
	@Transactional(readOnly=true)
	public Member getMemberByEmail(String email) {
		return memberRepository.getMemberByEmail(email);
	}

	@Override
	@Transactional
	public void register(Member member) {
		memberRepository.save(member);
	}	

	@Override
	@Transactional
	public Member setName(long id, String name) {
		Member member = memberRepository.getMemberById(id);
		if(member != null) {
			member.setName(name);
			return memberRepository.save(member);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public Member setEmail(long id, String email) {
		Member member = memberRepository.getMemberById(id);
		if(member != null) {
			member.setEmail(email);
			return memberRepository.save(member);
		} else {
			return null;
		}

	}

	@Override
	@Transactional
	public Member setAddress(long id, Address address) {
		Member member = memberRepository.getMemberById(id);
		if(member != null) {
			member.setAddress(address);
			return memberRepository.save(member);
		} else {
			return null;
		}

	}

}
