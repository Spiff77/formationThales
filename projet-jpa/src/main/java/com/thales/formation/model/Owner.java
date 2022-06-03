package com.thales.formation.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serial")
	private int id;

	private String name;

	@OneToMany(mappedBy = "owner")
	private Collection<Car> cars;
	
	@ManyToMany
	@JoinTable(name="ins_own", 
		joinColumns = @JoinColumn(name= "insurance_id"), 
		inverseJoinColumns = @JoinColumn(name = "owner_id"))
	private Collection<Insurance> insurances;
	
}
