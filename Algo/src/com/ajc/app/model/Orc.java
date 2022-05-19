package com.ajc.app.model;

import java.util.Objects;

public class Orc {
	
	private String name = "NameLess";
	private int health;
	private int force;
	private Adresse adresse;
	
	
	
	public Orc(String name, Adresse adresse) {
		super();
		this.name = name;
		this.adresse = adresse;
	}
	public Orc(String name, int health, int force) {
		this(health, force);
		this.name = name;
	}
	public Orc(int health, int force) {
		super();
		this.setHealth(health);
		this.force = force;
	}
	
	public void attack(Orc o) {
		o.health -= this.force;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health > 100 ? 100 : health;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orc other = (Orc) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	
}
