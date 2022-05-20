package com.ajc.app.model;

public abstract class AnimalVegan extends Animal{

	public AnimalVegan(String name) {
		super(name);
	}

	@Override
	public void manger() {
		System.out.println("Miam la fougère");		
	}
	
	
	
}
