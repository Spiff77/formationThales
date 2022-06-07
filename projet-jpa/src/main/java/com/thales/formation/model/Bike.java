package com.thales.formation.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
public class Bike extends Vehicle{


	public Bike(VehicleId id, int year, Option option, int nbGears) {
		super(id, year, option);
		this.nbGears = nbGears;
	}

	private int nbGears;

}
