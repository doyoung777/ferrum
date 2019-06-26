package com.sk.intensive.library.domain.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.intensive.library.domain.model.Notice;
import com.sk.intensive.library.domain.model.NoticeType;
import com.sk.intensive.library.domain.repository.NoticeRepository;

@Service("noticeLogic")
public class NoticeLogic implements NoticeService {
	@Autowired
	private NoticeRepository noticeRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Notice> getNotice() {
		return noticeRepository.findAll();
	}
	
	@Override
	@Transactional
	public Notice register(Notice notice) {
		return noticeRepository.save(notice);
	}

	@Override
	@Transactional
	public Notice setNoticeType(Long id, NoticeType noticetype) {
		Notice newNotice = noticeRepository.getNoticeById(id);
		newNotice.setNoticeType(noticetype);
		
		return noticeRepository.save(newNotice);
	}

	@Override
	@Transactional
	public Notice setNoticeTitle(Long id, String title) {
		Notice newNotice = noticeRepository.getNoticeById(id);
		newNotice.setTitle(title);
		
		return noticeRepository.save(newNotice);
	}

	@Override
	@Transactional
	public Notice setNoticeContents(Long id, String contents) {
		Notice newNotice = noticeRepository.getNoticeById(id);
		newNotice.setContents(contents);
		
		return noticeRepository.save(newNotice);
	}
	
}
