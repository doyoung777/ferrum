package com.sk.intensive.library.domain.service;

import java.util.List;

import com.sk.intensive.library.domain.model.Notice;
import com.sk.intensive.library.domain.model.NoticeType;

public interface NoticeService {	
	List<Notice> getNotice();	
	
	Notice register(Notice notice);

	Notice setNoticeType(Long id, NoticeType noticetype);
	
	Notice setNoticeTitle(Long id, String title);
	
	Notice setNoticeContents(Long id, String contents);

}

