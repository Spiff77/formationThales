package com.thales.formation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class B {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bName;
	
	@OneToOne(mappedBy = "b")
	private A a;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	
	
}
