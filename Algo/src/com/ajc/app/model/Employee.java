package com.ajc.app.model;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private BankInfo bankInfo;
	private Status status;
	
	public Employee(int id, String firstName, String lastName, double salary, BankInfo bankInfo, Status status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.bankInfo = bankInfo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", bankInfo=" + bankInfo + ", status=" + status + "]";
	}
	
	
	
}
