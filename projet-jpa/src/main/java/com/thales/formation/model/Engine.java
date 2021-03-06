package com.thales.formation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@NamedQuery(name="getAllEnginePowerAbove2000", query="SELECT e from Engine e where e.power > 2000")
@Entity
@Table(name = "engine")
public class Engine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serial")
	private int id;
	private String model;	
	private int power;
	
	@OneToOne(mappedBy = "engine")
	private Car car;

	public Engine(String model, int power) {
		super();
		this.model = model;
		this.power = power;
	}


}
