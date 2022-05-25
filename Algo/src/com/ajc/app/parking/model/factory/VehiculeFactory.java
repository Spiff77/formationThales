package com.ajc.app.parking.model.factory;

import com.ajc.app.parking.model.Vehicle;
import com.ajc.app.parking.model.RegisteredCar;

public class VehiculeFactory {

	private VehiculeFactory() {}

	private static VehiculeFactory INSTANCE;
	
	public Vehicle createVehicle(VehiculeType type, String brand, String plate) {
		switch(type) {
			case  REGISTEREDCAR:
				return new RegisteredCar(brand, plate);
			case  UNREGISTEREDCAR:
				return new RegisteredCar(brand, plate);
			case  REGISTEREDTRUCK:
				return new RegisteredCar(brand, plate);
			case  UNREGISTEREDTRUCK:
				return new RegisteredCar(brand, plate);
			default:
				return null;
				
		}
	}
	public static VehiculeFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new VehiculeFactory();
		}
		return INSTANCE;
	}
	
}
