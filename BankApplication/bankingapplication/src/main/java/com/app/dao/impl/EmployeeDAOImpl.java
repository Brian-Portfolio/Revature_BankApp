package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.dao.EmployeeDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Employee getEmployee(Employee employee) {
		Employee employee1 = null;
		int z = 0;
		try (Connection connection = PostgresqlConnection.getConnection()){
		String sql = "insert into bankingapplication.employee(employeeid, firstname, lastname, accountid) values (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, employee1.getEmployeeid());
		preparedStatement.setString(2, employee1.getFirstname());
		preparedStatement.setString(3, employee1.getLastname());
		preparedStatement.setInt(4, employee1.getAccountid());
		
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		return employee1;
	}

}