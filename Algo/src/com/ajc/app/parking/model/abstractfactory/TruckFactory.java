package com.ajc.app.parking.model.abstractfactory;

import com.ajc.app.parking.model.RegisteredTruck;
import com.ajc.app.parking.model.UnregisteredTruck;
import com.ajc.app.parking.model.Vehicle;

public class TruckFactory extends VehicleFactory{

	private static TruckFactory INSTANCE;
	
	private TruckFactory() {
	}

	@Override
	public Vehicle createRegisteredVehicle(String brand, String plate) {
		return new RegisteredTruck(brand, plate);
	}

	@Override
	public Vehicle createUnRegisteredVehicle(String brand, String plate) {
		return new UnregisteredTruck(brand, plate);
	}
	
	public static TruckFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new TruckFactory();
		}
		return INSTANCE;
	}

}
