package com.webla.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.entity.BankAccount;

@Repository
public interface AccountBalanceRepository 
extends CrudRepository<BankAccount, Integer> {

}
