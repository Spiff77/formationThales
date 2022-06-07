package com.thales.formation.model;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;

@Entity
@SecondaryTable(name= "insurance_details", pkJoinColumns = @PrimaryKeyJoinColumn(name="insu_id"))
public class Insurance{

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;

	private double amount;
	
	@ManyToMany(mappedBy = "insurances")
	private Collection<Owner> beneficaries = new ArrayList<Owner>();
	
	@Column(table = "insurance_details")
	private double coeficient;
	
	@Column(table = "insurance_details")
	private double taux;

	public Insurance(double amount, double coeficient, double taux) {
		super();
		this.amount = amount;
		this.coeficient = coeficient;
		this.taux = taux;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Collection<Owner> getBeneficaries() {
		return beneficaries;
	}

	public void setBeneficaries(Collection<Owner> beneficaries) {
		this.beneficaries = beneficaries;
	}

	public double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
	

}