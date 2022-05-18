package com.ajc.app.model;

import java.util.ArrayList;

public class Prof {
	
	private String nom;
	private ArrayList<Eleve> eleves = new ArrayList<Eleve>();
	
	public Prof(String nom, Eleve eleve) {
		this.nom = nom;
		this.add(eleve);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void add(Eleve e) {
		this.eleves.add(e);
	}
	
	public ArrayList<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(ArrayList<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Prof [nom=" + nom + ", eleves=" + eleves + "]";
	}
}
