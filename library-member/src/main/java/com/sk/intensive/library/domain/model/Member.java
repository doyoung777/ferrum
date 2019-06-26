package com.sk.intensive.library.domain.model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import com.sk.intensive.library.common.base.AbstractEntity;
import com.sk.intensive.library.common.base.AggregateRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Member extends AbstractEntity implements AggregateRoot {
	private String name;
	private String email;
	
	@Enumerated(EnumType.ORDINAL)
	private MemberType memberType;
	
	private Address address;
	
	public Member() {
		
	}

	public Member(String name, String email, MemberType memberType) {
		this.name = name;
		this.email = email;
		this.memberType = memberType;
	}
	
}
