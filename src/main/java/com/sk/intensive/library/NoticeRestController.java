package com.sk.intensive.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.intensive.library.domain.model.Notice;
import com.sk.intensive.library.domain.model.NoticeType;
import com.sk.intensive.library.domain.service.NoticeService;

@RestController
@RequestMapping("/v1/library-notice")
public class NoticeRestController implements NoticeService {
	
	@Autowired
	private NoticeService noticeService;

	@Override
	@GetMapping
	public List<Notice> getNotice() {
		return noticeService.getNotice(); 
	}
	
	@Override
	@PostMapping
	public Notice register(@RequestBody Notice notice) {
		return noticeService.register(notice);
	}
	
	@Override
	@PutMapping("/update/noticetype")
	public Notice setNoticeType(Long id, NoticeType noticetype) {
		return noticeService.setNoticeType(id, noticetype);
	}
	
	@Override
	@PutMapping("/update/title")
	public Notice setNoticeTitle(Long id, String title) {
		return noticeService.setNoticeTitle(id, title);
	}
	
	@Override
	@PutMapping("/update/contents")
	public Notice setNoticeContents(Long id, String contents) {
		return noticeService.setNoticeContents(id, contents);
	}
	
}
