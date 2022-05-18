package com.ajc.app.model;

import java.util.Objects;

public class Phone {
	private int id;
	private String brand;
	private String serialNumber;
	
	public Phone(int id, String brand, String serialNumber) {
		super();
		this.id = id;
		this.brand = brand;
		this.serialNumber = serialNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", serialNumber=" + serialNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(serialNumber, other.serialNumber);
	}
	
	
	
	
}
