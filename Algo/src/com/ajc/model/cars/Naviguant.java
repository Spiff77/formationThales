package com.ajc.model.cars;

public interface Naviguant {
	
	public String name = "hello";
	
	public void flotter();
	public void amarrer();
	default String saysHello() {
		return "Hello";
	}
}
