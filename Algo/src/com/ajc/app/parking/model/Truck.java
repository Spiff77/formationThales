package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class Truck extends Vehicle{
	public Truck(String brand, String plate) {
		super(brand, plate);
	}
}
