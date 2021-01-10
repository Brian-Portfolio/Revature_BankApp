package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.AccountDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Account;

public class AccountDAOImpl implements AccountDAO{

	@Override
	public int createAccountType(Account accounttype) throws BusinessException{
		int z =0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.account(accounttype) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, accounttype.getAccounttype());
			z = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred contact SYSADMIN");
		} 
		return z;
	}
		
	@Override
	public int getDateOfCreatedAccount(Account opendate) throws BusinessException {
		int z =0;
		try(Connection connection = PostgresqlConnection.getConnection()){
		String sql = "insert into bankingapplication.account(opendate) values (?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
		preparedStatement.setString(1, opendate.getOpendate() );
		
		} catch ( ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred contact SYSADMIN");
		}
		return z;
	}

	@Override
	public int updateAccountBalance(int accountbalance, int accountid) throws BusinessException {
		int z =0;
		try(Connection connection = PostgresqlConnection.getConnection()){
		String sql = "update bankingapplication.account set accountbalance = ? where accountid = ?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, accountbalance);
		preparedStatement.setInt(2, accountid);
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred contact SYSADMIN");
		}
		return z;
	}
	
	@Override
	public List<Account> getAccountBalanceByAccountId(int accountid) {
		
		return null;
	}

}
