package com.ajc.app.model.cars;

public abstract class Vehicule {

	private int engine;
	protected String brand;
	public Vehicule(int engine, String brand) {
		super();
		this.engine = engine;
		this.brand = brand;
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public final String displayEngine() {
		return "Le vehicule" +brand + "a une puissance de "+engine;
	}
	
	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
