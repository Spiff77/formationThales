package com.thales.formation.model.student;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private int streetNumber;
	private String streetName;
	private String city;
	private String country;
	
}
