package com.sk.intensive.library.domain.model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sk.intensive.library.common.base.AbstractEntity;
import com.sk.intensive.library.common.base.AggregateRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity(name ="Member")
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "LOGINID_UNIQUE", columnNames = "loginId")})

public class Member extends AbstractEntity implements AggregateRoot {
	private String name;
	private String email;
	private String loginId;
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	private MemberType memberType;
	
	private Address address;

	public Member() {
		
	}
	
	public Member(String name, String email, String loginId, String password, MemberType memberType) {
		this.name = name;
		this.email = email;
		this.loginId = loginId;
		this.password = password;
		this.memberType = memberType;
	}
	
}
