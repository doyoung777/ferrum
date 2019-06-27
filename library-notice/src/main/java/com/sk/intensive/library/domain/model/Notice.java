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
public class Notice extends AbstractEntity implements AggregateRoot {
	
	@Enumerated(EnumType.ORDINAL)
	private NoticeType noticeType;
	
	private String title;
	private String contents;
	private long writer;
	private String registerDate;

	
	public Notice(NoticeType noticeType, String title, String contents, long writer, String registerDate) {
		this.noticeType = noticeType;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.registerDate = registerDate;
	}

	
}

