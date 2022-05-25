package com.ajc.app.resto.model;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

@ToString
public class Commande {
	private String name;
	private Eboisson boisson;
	private Eplat plat;
	private Edessert dessert;
	private Ticket ticket;
	
	public class Ticket {
		private List<String> lines = new ArrayList();
		
		public Ticket() {
			System.out.println(Commande.this.name);
		}
	}
	public enum Machin{
		A,B,C;
	}
	
	
	public Commande(String name, Eboisson boisson, Eplat plat, Edessert dessert) {
		super();
		this.name = name;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
	}
	
	public float calculPrixTotal() {
		this.ticket = new Ticket();
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
