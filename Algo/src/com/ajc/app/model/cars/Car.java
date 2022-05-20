package com.ajc.app.model.cars;

public class Car extends Vehicule {

	public Car(int engine, String brand) {
		super(engine, brand);
	}

	@Override
	public void start() {
		System.out.println("La voiture "+this.brand+ " démarre");

	}

	@Override
	public void stop() {
		System.out.println("La voiture "+this.brand+ " se gare sur la bas côté");

	}

}
