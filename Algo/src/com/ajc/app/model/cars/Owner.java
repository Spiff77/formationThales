package com.ajc.app.model.cars;

import java.util.ArrayList;
import java.util.List;

public class Owner {

	private String name;
	private List<Vehicule> vehicles = new ArrayList<Vehicule>();
	
	public Owner(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicule> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicule> vehicles) {
		this.vehicles = vehicles;
	}

	public int countByBrand(String brand) {
		return (int) this.vehicles.stream().filter(c -> c.getBrand().equals(brand)).count();
	}
	
	public void add(Vehicule v) {
		this.vehicles.add(v);
	}
	
	public void startAll() {
		this.vehicles.stream().forEach(Vehicule::start);
	}

}
