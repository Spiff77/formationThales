package com.thales.formation.model;

import java.util.ArrayList;
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
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serial")
	private int id;

	private String name;

	
	
	public Owner(String name) {
		super();
		this.name = name;
	}

	@OneToMany(mappedBy = "owner")
	private Collection<Car> cars;
	
	@ManyToMany
	@JoinTable(name="ins_own", 
		joinColumns = { @JoinColumn(name= "insurance_id")}, 
		inverseJoinColumns = @JoinColumn(name = "owner_id"))
	private Collection<Insurance> insurances = new ArrayList<Insurance>();


	public void add(Insurance insurance) {
		this.insurances.add(insurance);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Car> getCars() {
		return cars;
	}

	public void setCars(Collection<Car> cars) {
		this.cars = cars;
	}

	public Collection<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(Collection<Insurance> insurances) {
		this.insurances = insurances;
	}
	
	
	
}