package com.sk.intensive.library.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.intensive.library.domain.model.Notice;


@RepositoryRestResource
public interface NoticeRepository extends PagingAndSortingRepository<Notice, Long>,
                                           QuerydslPredicateExecutor<Notice> {	
	List<Notice> findAll();
	//Notice findOne(@Param("id") Long id);
	Notice getNoticeById(@Param("id") Long id);
}
