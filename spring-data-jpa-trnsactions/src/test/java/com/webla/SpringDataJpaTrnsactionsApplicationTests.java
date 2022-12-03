package com.webla;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webla.service.AccountBalanceService;

@SpringBootTest
class SpringDataJpaTrnsactionsApplicationTests {
    @Autowired
	private AccountBalanceService accountBalanceService;
	@Test
	void contextLoads() {
	}

	@Test
	public void testTransfer() {
		accountBalanceService.transferAmount();
	}
	
}
