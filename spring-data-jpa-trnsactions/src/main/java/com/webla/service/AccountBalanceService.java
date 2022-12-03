package com.webla.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webla.entity.BankAccount;
import com.webla.repos.AccountBalanceRepository;

@Service
public class AccountBalanceService {
	
	@Autowired
	private AccountBalanceRepository accountBalanceRepository;
	
	//@Transactional(dontRollbackOn = RuntimeException.class)
	public void transferAmount() {
		BankAccount sunilBA = accountBalanceRepository.findById(1).get();
		BankAccount anilBA = accountBalanceRepository.findById(2).get();
		
		sunilBA.setBal(sunilBA.getBal() - 500);
		anilBA.setBal(anilBA.getBal() + 500);
		accountBalanceRepository.save(sunilBA);
		
		if(true) {
			throw new RuntimeException();
		}
		accountBalanceRepository.save(anilBA);
	}
	
}
