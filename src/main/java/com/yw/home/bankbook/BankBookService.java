package com.yw.home.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setBook(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setBook(bankBookDTO);
	}
	

	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setChangeSale(bankBookDTO);
	}
	

	public List<BankBookDTO> getList() throws Exception {
		return bankBookDAO.getList();
	}
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.getDetail(bankBookDTO);
	}
	
	public int deleteBook(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.deleteBook(bankBookDTO);
	}
}
