package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class Car extends Vehicle{
	public Car(String brand, String plate) {
		super(brand, plate);
	}
}
