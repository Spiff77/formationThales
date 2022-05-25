package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public final class RegisteredTruck extends Truck{
	public RegisteredTruck(String brand, String plate) {
		super(brand, plate);
	}
}
