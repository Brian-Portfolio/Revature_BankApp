package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.dao.CustomerLoginDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.CustomerLogin;

public class CustomerLoginDAOImpl implements CustomerLoginDAO{

	@Override
	public int createCustomerLogin(CustomerLogin customerlogin) {
		int z = 0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql ="insert into bankingapplication.account(accountid, username, password) values (?, ?, ?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, customerlogin.getAccountid());
			preparedStatement.setString(2, customerlogin.getUsername());
			preparedStatement.setString(3, customerlogin.getPassword());
			
			
			z = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			
		}
		
		return z;
	}
	
	
}
