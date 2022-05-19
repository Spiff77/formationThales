package com.ajc.app.model;

public class Singleton {
	
	private static Singleton INSTANCE;
	private String name;
	private float salary;
	
	public static Singleton getInstance() {
		if(INSTANCE == null) {			
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private Singleton() {
		System.out.println("Constructor called");
	}
	

}