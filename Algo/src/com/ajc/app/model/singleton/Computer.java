package com.ajc.app.model.singleton;

import com.ajc.app.model.WeekDay;

public class Computer {
	
	private String name;
	private WeekDay updateDay;


	public Computer(String name, WeekDay updateDay) {
		super();
		this.name = name;
		this.updateDay = updateDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public WeekDay getUpdateDay() {
		return updateDay;
	}

	public void setUpdateDay(WeekDay updateDay) {
		this.updateDay = updateDay;
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
