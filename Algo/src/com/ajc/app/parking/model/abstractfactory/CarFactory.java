package com.ajc.app.parking.model.abstractfactory;

import com.ajc.app.parking.model.RegisteredCar;
import com.ajc.app.parking.model.UnregisteredCar;
import com.ajc.app.parking.model.Vehicle;

public class CarFactory extends VehicleFactory{

	private static CarFactory INSTANCE;
	
	private CarFactory() {}

	@Override
	public Vehicle createRegisteredVehicle(String brand, String plate) {
		return new RegisteredCar(brand, plate);
	}

	@Override
	public Vehicle createUnRegisteredVehicle(String brand, String plate) {		// TODO Auto-generated method stub
		return new UnregisteredCar(brand, plate);
	}
	
	public static CarFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new CarFactory();
		}
		return INSTANCE;
	}

}
