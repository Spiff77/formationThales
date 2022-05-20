package com.ajc.app.model;

public class Panda extends AnimalVegan{

	public Panda(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		System.out.println("Panda say hello");
	}

}
