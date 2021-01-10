package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.dao.TransactionDAO;
import com.app.dao.dbutil.PostgresqlConnection;

public class TransactionDAOImpl implements TransactionDAO{

	@Override
	public int createTransactionAmount(int transactionamount) {
		int z = 0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactionamount) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, transactionamount);
			z = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		return z;
	}

	@Override
	public String dateOfCreatedTransaction(String transactiondate) {
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactiondate) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, transactiondate);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return transactiondate;
	}

	@Override
	public String chooseTransactionType(String transactiontype) {
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactiontype) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, transactiontype);
			preparedStatement.executeUpdate();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return transactiontype;
	}

}