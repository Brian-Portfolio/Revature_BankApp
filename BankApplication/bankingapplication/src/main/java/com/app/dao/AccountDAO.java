package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Account;

public interface AccountDAO {
	
	//public Account getAccount
	public int createAccount(Account account) throws BusinessException;
	public int createaccountReference(int accountid);
	public String createAccountType(String accounttype) throws BusinessException;
	public String getDateOfCreatedAccount(String opendate) throws BusinessException;
	public int getUpdateAccountBalance(int accountbalance, int accountid) throws BusinessException;
	public List<Account> getAccountBalanceByAccountId(int accountid);
	
}
