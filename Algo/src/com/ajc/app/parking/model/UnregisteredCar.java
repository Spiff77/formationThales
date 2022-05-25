package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public final class UnregisteredCar extends Car implements TollGatePayable{
	public UnregisteredCar(String brand, String plate) {
		super(brand, plate);
	}

	@Override
	public int payTollGate() {
		return 3;
	}
}
