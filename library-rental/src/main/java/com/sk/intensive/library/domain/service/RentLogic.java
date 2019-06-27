package com.sk.intensive.library.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.intensive.library.domain.model.Rent;
import com.sk.intensive.library.domain.repository.RentRepository;

@Service("rentLogic")
public class RentLogic implements RentService {
	@Autowired
	private RentRepository rentRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Rent> getRentByMember(Long membernum) {
		return (List<Rent>) rentRepository.getRentByMembernum(membernum);
	}
	
	@Override
	@Transactional
	public Rent rentBook(Rent rent) {
		return rentRepository.save(rent);
	}

	@Override
	@Transactional
	public Rent returnRentedBook(Long id, String returndate) {
		Rent newRent = rentRepository.getRentById(id);
		newRent.setReturndate(returndate);
		
		return rentRepository.save(newRent);
	}


	
}
