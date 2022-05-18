package com.ajc.app.model;

public class Status {
	
	private boolean manager = false;
	private int year;
	
	
	public Status( int year) {
		super();
		this.year = year;
	}
	
	public Status(boolean manager, int year) {
		this(year);
		this.manager = manager;
		
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Status [manager=" + manager + ", year=" + year + "]";
	}
	
	
	

	
	
}
