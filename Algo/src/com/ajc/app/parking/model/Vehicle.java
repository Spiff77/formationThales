package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class Vehicle {

	private static int count = 0;
	private int id;
	private String brand; 
	private String plate;
	public Vehicle(String brand, String plate) {
		this.id =  ++count;
		this.brand = brand;
		this.plate = plate;
	}
	
	

}
