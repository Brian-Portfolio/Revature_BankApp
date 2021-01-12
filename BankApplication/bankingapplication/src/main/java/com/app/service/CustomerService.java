package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Customer;


public interface CustomerService {

	public Customer getCustomerFirstName(String firstname) throws BusinessException;
	public Customer getCustomerMiddleName(String middlename) throws BusinessException;
	public Customer getCustomerLastName(String lastname) throws BusinessException;
	public Customer getCustomerEmailAddress(String emailaddress) throws BusinessException;
	public Customer getCustomerDOB(String dateofbirth) throws BusinessException;	
	public Customer getCustomerCity(String city) throws BusinessException;
	public Customer getCustomerState(String state) throws BusinessException;
	public Customer getCustomerGender(String gender) throws BusinessException;
	public Customer getCustomerAddress(String customeraddress) throws BusinessException;
	//public int createCustomerLogin(CustomerLogin customerlogin);
	//public int chooseAccountType();
	
	
}
