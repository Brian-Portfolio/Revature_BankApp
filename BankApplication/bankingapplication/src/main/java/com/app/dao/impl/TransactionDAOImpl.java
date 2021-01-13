package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.dao.TransactionDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.main.BankAppMain;
import com.app.model.Transaction;

public class TransactionDAOImpl implements TransactionDAO{

	Logger log = Logger.getLogger(BankAppMain.class);

//	@Override
//	public int createTransactions(Transaction transaction) {
//		int z =0;
//		try (Connection connection = PostgresqlConnection.getConnection()){
//			String sql = "insert into bankingapplication.transaction(transactionid, transactiondate, accountid, transactionamount, transactiontype, customerid, totalbalance) values (?,?,?,?,?,?,?)";
//			PreparedStatement preparedStatement=connection.prepareStatement(sql);
//			
//			preparedStatement.setInt(1, transaction.getTransactionid());
//			preparedStatement.setString(2, transaction.getTransactiondate());
//			preparedStatement.setInt(3, transaction.getAccountid());
//			preparedStatement.setInt(4, transaction.getTransactionamount());
//			preparedStatement.setString(5, transaction.getTransactiontype());
//			preparedStatement.setInt(6, transaction.getCustomerid());
//			preparedStatement.setInt(7, transaction.getTotalbalance());
//			z = preparedStatement.executeUpdate();
//			
//			
//		}catch (ClassNotFoundException | SQLException e) {
//			System.out.println(e);
//		}
//		
//		return z;
//	}
	
	@Override
	public Transaction createTransactionAmount(int transactionamount) {
		Transaction transaction = null;
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactionamount) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, transactionamount);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			log.info(e);
		}
		
		return transaction;
	}


	@Override
	public Transaction createTransactionType(String transactiontype) {
		Transaction transaction = null;
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactiontype) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, transactiontype);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			log.info(e);
		}
		return transaction;
	}



	@Override
	public Transaction createTransactionDate(String transactiondate) {
		Transaction transaction = null;
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into bankingapplication.transaction(transactiondate) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, transactiondate);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			log.info(e);
		}
		return transaction;
	}




}
