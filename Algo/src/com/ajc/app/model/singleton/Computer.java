package com.ajc.app.model.singleton;

public class Computer {
	
	private String name;

	public Computer(String name) {
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
		builder.append("Computer [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public void print(String content) {
		Centraliser.getInstance().print(content);
	}
	
}
