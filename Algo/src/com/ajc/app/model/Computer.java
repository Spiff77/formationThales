package com.ajc.app.model;

import java.util.Random;

public class Computer {
	
	 private int id;
	 private String model = "Dell";
	 private float frequency = 2.4f;
	
	 public Computer(String model, float frequency) {
		this(model);
		this.setFrequency(frequency);
	}
		
	 public Computer(String model) {
		this();
		this.model = model;
	}
		
	 public Computer() {
		Random rand = new Random();
		this.id = rand.nextInt(500);
	}
	 
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency < 1 ? 1 : frequency;
	}

	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", model=" + model + ", frequency=" + frequency + "]";
	}

}

