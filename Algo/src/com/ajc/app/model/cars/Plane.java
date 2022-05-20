package com.ajc.app.model.cars;

public class Plane extends Vehicule {

	public Plane(int engine, String brand) {
		super(engine, brand);
	}

	@Override
	public void start() {
		System.out.println("L'avion "+this.brand+ " décoller");
	}

	@Override
	public void stop() {
		System.out.println("L'avion "+this.brand+ " attérit");
	}
	
	public void fly() {
		System.out.println("L'avion "+this.brand+ " survol le pays");

	}

}
