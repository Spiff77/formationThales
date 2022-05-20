package com.ajc.app.model.cars;

public class Boat extends Vehicule {

	public Boat(int engine, String brand) {
		super(engine, brand);
	}

	@Override
	public void start() {
		System.out.println("Le bateau "+this.brand+ " lève l'ancre");

	}

	@Override
	public void stop() {
		System.out.println("Le bateau "+this.brand+ " jete son ancre");
	}
	
	public void sail() {
		System.out.println("Le bateau "+this.brand+ " navigue sur les flôts");

	}

}
