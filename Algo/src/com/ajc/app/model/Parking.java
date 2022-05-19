package com.ajc.app.model;

import java.util.ArrayList;

public class Parking {
	
	private String name;
	private String city;
	private String adresse;
	private ArrayList<Car> cars = new ArrayList<Car>();
	public static final int nbPlace;  
	
	static {
		System.out.println("Connection DB");
		nbPlace = 2000;

	}
	
	public Parking(String name, String city, String adresse) {
		super();
		this.name = name;
		this.city = city;
		this.adresse = adresse;
	}

	public int countByBrand(String brand) {
		
		return (int) cars.stream()
				.filter( c -> c.getCarInfo().getBrand().equals(brand))
				.count();
	}
	
	public void add(Car car) {
		this.cars.add(car);
	}
	
	public static void saySomething()
	{
		System.out.println("Heyyyy");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parking [name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", cars=");
		builder.append(cars);
		builder.append("]");
		return builder.toString();
	}


	
}
