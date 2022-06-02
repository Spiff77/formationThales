package com.ajc.app.model.scott.dao;

import java.util.List;

import com.ajc.app.model.scott.dao.utils.GenericDao;
import com.ajc.app.model.scott.model.Employee;

public interface EmployeeDAO extends GenericDao<Integer, Employee>{
	public List<Employee> findAllBySalaryAbove(int salary);
}
