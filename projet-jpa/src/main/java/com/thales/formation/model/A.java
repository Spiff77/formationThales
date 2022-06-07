package com.thales.formation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class A {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String aName;
	
	@OneToOne
	private B b;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}


	
	
}
