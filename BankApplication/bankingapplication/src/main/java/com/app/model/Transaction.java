package com.app.model;

public class Transaction {

	private int transactionid;
	private String transactiondate;
	private int accountid;
	private int transactionamount;
	private int transactiontype;
	private int customerid; 
	private int totalbalance;
	
	public Transaction() {
		
	}


	public Transaction(int transactionid, String transactiondate, int accountid, int transactionamount,
			int transactiontype, int customerid, int totalbalance) {
		super();
		this.transactionid = transactionid;
		this.transactiondate = transactiondate;
		this.accountid = accountid;
		this.transactionamount = transactionamount;
		this.transactiontype = transactiontype;
		this.customerid = customerid;
		this.totalbalance = totalbalance;
	}


	public int getTransactionid() {
		return transactionid;
	}


	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}


	public String getTransactiondate() {
		return transactiondate;
	}


	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}


	public int getAccountid() {
		return accountid;
	}


	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}


	public int getTransactionamount() {
		return transactionamount;
	}


	public void setTransactionamount(int transactionamount) {
		this.transactionamount = transactionamount;
	}


	public int getTransactiontype() {
		return transactiontype;
	}


	public void setTransactiontype(int transactiontype) {
		this.transactiontype = transactiontype;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public int getTotalbalance() {
		return totalbalance;
	}


	public void setTotalbalance(int totalbalance) {
		this.totalbalance = totalbalance;
	}


	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", transactiondate=" + transactiondate + ", accountid="
				+ accountid + ", transactionamount=" + transactionamount + ", transactiontype=" + transactiontype
				+ ", customerid=" + customerid + ", totalbalance=" + totalbalance + "]";
	}
	
	
	
}