package com.ajc.app.model.resto;

public class Commande {
	private String name;
	private Eboisson boisson;
	private Eplat plat;
	private Edessert dessert;
	
	public Commande(String name, Eboisson boisson, Eplat plat, Edessert dessert) {
		super();
		this.name = name;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
	}
	
	public float calculPrixTotal() {
		return this.boisson.getPrice() + this.plat.getPrice() + this.dessert.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Eboisson getBoisson() {
		return boisson;
	}

	public void setBoisson(Eboisson boisson) {
		this.boisson = boisson;
	}

	public Eplat getPlat() {
		return plat;
	}

	public void setPlat(Eplat plat) {
		this.plat = plat;
	}

	public Edessert getDessert() {
		return dessert;
	}

	public void setDessert(Edessert dessert) {
		this.dessert = dessert;
	}
	
	
	
	
	
	
}
