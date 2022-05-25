package com.ajc.app.parking.model.abstractfactory;

import com.ajc.app.parking.model.Vehicle;

public abstract class VehicleFactory {
	
	public abstract Vehicle createRegisteredVehicle(String brand, String plate);
	public abstract Vehicle createUnRegisteredVehicle(String brand, String plate);
	
	public static VehicleFactory getFactory(VehicleType type) {
		if(type== VehicleType.CAR) {
			return CarFactory.getInstance();
		}else if(type == VehicleType.TRUCK) {
			return TruckFactory.getInstance();
		}
		return null;
	}

}
