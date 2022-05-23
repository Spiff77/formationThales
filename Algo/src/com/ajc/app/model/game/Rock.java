package com.ajc.app.model.game;

public class Rock implements Attackable{
	
	double health = 100;
	String name;
	
	public Rock(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receiveDamage(double damage) {
		this.health -= damage;
		
	}
}
