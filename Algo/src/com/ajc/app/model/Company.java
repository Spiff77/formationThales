package com.ajc.app.model;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Company(String name) {
		super();
		this.name = name;
	}
	
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", employees=" + employees + "]";
	}
	
	
	
}
