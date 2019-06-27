package com.sk.intensive.library.domain.model;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sk.intensive.library.common.base.AbstractEntity;
import com.sk.intensive.library.common.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Rent extends AbstractEntity implements AggregateRoot {
	
	private String rentdate;
	private Long bookid;
	private String returndate;
	private Long membernum;
	
	public Rent(String rentdate, Long bookid, String returndate, Long membernum) {
		this.rentdate = rentdate;
		this.bookid = bookid;
		this.returndate = returndate;
		this.membernum = membernum;
	}
}

