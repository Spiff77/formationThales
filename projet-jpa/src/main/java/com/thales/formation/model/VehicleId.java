package com.thales.formation.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class VehicleId implements Serializable{

	private String model;
	private boolean cabriolet;
	
	public VehicleId(String model, boolean cabriolet) {
		super();
		this.model = model;
		this.cabriolet = cabriolet;
	}
	
	

}
