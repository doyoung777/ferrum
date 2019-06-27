package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.querydsl.core.types.Predicate;
import com.sk.intensive.library.domain.model.Address;
import com.sk.intensive.library.domain.model.Member;
import com.sk.intensive.library.domain.model.QMember;
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

	@Override
	@Transactional(readOnly=true)
	public String login(String loginId, String password) {
		Predicate predicate = QMember.member.loginId.eq(loginId).and(QMember.member.password.eq(password));
		List<Member> member = memberRepository.findAll(predicate);
		if(member.isEmpty()) {
			return "아이디/패스워드가 다릅니다.";
		}else {
			return "반갑습니다. "+member.get(0).getName()+" 고객님";
		}
	}
	
	

}
