package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.service.BankService;


@Controller
public class AccountController {

	@Autowired
	private BankService bankService;
	
	
	public BankService getBankService() {
		return bankService;
	}


	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}


	@RequestMapping("/open")
	public String openAccount() {
		System.out.println("ok opened!");
		
//		BankServiceImpl bankServiceImpl=new BankServiceImpl();		
//		BankDAOImplDB bankDAOImplDB=new BankDAOImplDB();
//		bankServiceImpl.setBankDAO(bankDAOImplDB);
//		bankServiceImpl.openAccount();
		
		bankService.openAccount();
		System.out.println("1");
		
		return "index.jsp";
		
	}
}
