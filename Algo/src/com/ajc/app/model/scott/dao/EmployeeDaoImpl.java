package com.ajc.app.model.scott.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ajc.app.model.scott.model.Employee;
import com.ajc.app.model.scott.utils.ConnectionManager;

public class EmployeeDaoImpl  implements EmployeeDAO{

	@Override
	public List<Employee> findAll() {
		List<Employee> emps = new ArrayList<Employee>();
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection conn = ConnectionManager.getInstance().getConnection();
			
			 st = conn.createStatement();
			 rs = st.executeQuery("select * from emp");

			while(rs.next()) {
				emps.add(new Employee(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getDate("hiredate")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ConnectionManager.getInstance().closeStatement(st);
		ConnectionManager.getInstance().closeResultSet(rs);
		return emps;
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Employee obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllBySalaryAbove(int salary) {
		// TODO Auto-generated method stub
		return null;
	}


}
