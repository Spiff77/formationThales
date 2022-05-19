package com.ajc.app.model.singleton;

public class Printer {
	
	private String name;

	public Printer(String name) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("Printer [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public void print(String content) {
		System.out.println("printing "+ content + " on printer " + this.name);
	}
	
	
	
}
