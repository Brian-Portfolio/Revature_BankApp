package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface CustomerDAO {
	
	public int createCustomer(String firstname, String middlename, String lastname, String city, String state, String gender, String customeraddress, String dateofbirth) throws BusinessException;
	public Customer getCustomerFirstName(String firstname) throws BusinessException;
	public Customer getCustomerMiddleName(String middlename) throws BusinessException;
	public Customer getCustomerLastName(String lastname) throws BusinessException;
	public Customer getCustomerEmailAddress(String emailaddress) throws BusinessException;
	public Customer getCustomerCity(String city) throws BusinessException;
	public Customer getCustomerState(String state) throws BusinessException;
	public Customer getCustomerGender(String gender) throws BusinessException;
	public Customer getCustomerAddress(String customeraddress) throws BusinessException;
	public Customer getCustomerDOB(String dateofbirth) throws BusinessException;
	public List<Customer> getCustomerById(int customerid);
	public List<Customer> getAllCustomers();
	
}
