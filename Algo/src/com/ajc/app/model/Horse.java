package com.ajc.app.model;

public class Horse {
	private String name;

	public Horse(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Horse [name=" + name + "]";
	}
	
	
}
