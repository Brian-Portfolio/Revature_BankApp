package com.app.dao;

public interface TransactionDAO {

	public int createTransactionAmount(int transactionamount);
	public String dateOfCreatedTransaction(String transactiondate);
	public String chooseTransactionType(String transactiontype);
}