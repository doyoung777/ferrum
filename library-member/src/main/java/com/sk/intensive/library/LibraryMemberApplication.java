package com.sk.intensive.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.sk.intensive.library.domain.model.Address;
import com.sk.intensive.library.domain.model.Member;
import com.sk.intensive.library.domain.model.MemberType;
import com.sk.intensive.library.domain.repository.MemberRepository;

@SpringBootApplication
public class LibraryMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMemberApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(MemberRepository memberRepository) {	
		return (args) -> {
			
			//Iterable<Member> memberList1 = memberRepository.findAll();
			//if(memberList1 == null) {
				insertMembers(memberRepository);
				displayMembers(memberRepository);
			//}	
			//displayMembers(memberRepository);
		};
	}
		
	public void insertMembers(MemberRepository memberRepository) {
		Member member = new Member("홍길동", "silverte@sk.com", MemberType.USER);
		member.setAddress(new Address(34510, "서울시 서초구 우면동"));
		memberRepository.save(member);
		
		Member member2 = new Member("이순신", "km78cho@gmail.com", MemberType.USER);
		member2.setAddress(new Address(44150, "용인시 수지구 상현동"));
		memberRepository.save(member2);
		
		Member member3 = new Member("성춘향", "admin@sk.com", MemberType.ADMIN);
		member3.setAddress(new Address(52110, "성남시 분당구 정자동"));
		memberRepository.save(member3);
	}
	
	public void displayMembers(MemberRepository memberRepository) {
		System.out.println("***************************************************************");
		
		Iterable<Member> memberList = memberRepository.findAll();
		for(Member member : memberList) {
			System.out.println(member.toString());	
		}
		
		System.out.println("***************************************************************");
	}

}
