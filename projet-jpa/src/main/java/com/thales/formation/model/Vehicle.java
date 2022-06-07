package com.thales.formation.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
	
	@EmbeddedId
	private VehicleId id;
	
	private int year;
	
	
	public Vehicle(VehicleId id, int year, Option option) {
		super();
		this.id = id;
		this.year = year;
		this.option = option;
	}

	@ManyToOne()
	Owner owner;
	
	@Embedded
	Option option;

	
	

}
