package com.thales.formation.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter @Setter
public abstract class Vehicle {
	
	@EmbeddedId
	private VehicleId id;
	
	private int year;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String photo;
	
	
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
