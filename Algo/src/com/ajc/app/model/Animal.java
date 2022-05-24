package com.ajc.app.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Animal implements Serializable{
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract void sayHello();
	
	public abstract void manger();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}


	
	
	
}
