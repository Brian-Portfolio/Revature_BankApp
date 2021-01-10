package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Account;

public interface AccountDAO {

	public int createAccountType(Account accounttype) throws BusinessException;
	public int getDateOfCreatedAccount(Account opendate) throws BusinessException;
	public int updateAccountBalance(int accountbalance, int accountid) throws BusinessException;
	public List<Account> getAccountBalanceByAccountId(int accountid);
	
}
