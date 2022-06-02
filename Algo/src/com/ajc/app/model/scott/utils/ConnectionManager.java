package com.ajc.app.model.scott.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ajc.app.model.scott.dao.EmployeeDAO;
import com.ajc.app.model.scott.dao.EmployeeDaoImpl;

import lombok.Getter;

@Getter
public class ConnectionManager {

	private static ConnectionManager INSTANCE;
	private Connection connection;
	private EmployeeDAO employeeDao;
	
	private ConnectionManager() {

		try {
			System.out.println("Init Connection");
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:9001/scott", "root", "root");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static ConnectionManager getInstance() {
		if(INSTANCE == null) {
			INSTANCE =  new ConnectionManager();
		}
		return INSTANCE;
	}
	
	public void close() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		finally {
			this.connection = null;
			INSTANCE = null;
		}
	}
	
	public void closeStatement(Statement statement) {
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void closeResultSet(ResultSet resultSet) {
		try {
			if(resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public EmployeeDAO getEmployeeDao()
	{
		if(this.employeeDao == null) {
			this.employeeDao = new EmployeeDaoImpl();
		}
		return employeeDao;
	}
}

