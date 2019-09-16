package com.bank.service.impl;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bank.dao.TempDAO;
import com.bank.pojo.Temp;
import com.bank.pojo.Users;
import com.bank.service.BankService;

@Service
public class BankServiceImpl implements BankService{

//	@MyDAO(name="BankDAOImplMap")
//	@Autowired
//	@Qualifier("bankDAOImplDB")
//	private BankDAO bankDAO;
	
	@Autowired
	private TempDAO tempDAO;
	
//	public BankDAO getBankDAO() {
//		return bankDAO;
//	}
//
//	public void setBankDAO(BankDAO bankDAO) {
//		this.bankDAO = bankDAO;
//	}

	public Users openAccount() {
		System.out.println("sercie");
		
		System.out.println(tempDAO.selectTemp(1).getBb());
		return null;
	}
}
