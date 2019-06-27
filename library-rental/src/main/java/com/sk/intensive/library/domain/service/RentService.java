package com.sk.intensive.library.domain.service;

import java.util.List;

import com.sk.intensive.library.domain.model.Rent;

public interface RentService {
	
	List<Rent> getRentByMember(Long membernum);	
	
	Rent rentBook(Rent rent);

	Rent returnRentedBook(Long id, String returndate);
	
}
