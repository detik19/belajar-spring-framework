package com.subrutin.abcbank.service.impl;

import java.math.BigDecimal;

import com.subrutin.abcbank.repository.AccountRepository;
import com.subrutin.abcbank.service.TransferService;

public class TransferServiceImpl implements TransferService{
	
	private AccountRepository accountRepository;
	
	
	public TransferServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public Boolean ownAccountTransfer(String sourceAccount, String destinationAccount, BigDecimal amount) {
		
		return null;
	}
	
	

}
