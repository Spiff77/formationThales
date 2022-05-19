package com.ajc.app.model;

public class Eleve {
	
	private String nom;
	private int note;
	
	public Eleve(String nom, int note) {
		super();
		this.nom = nom;
		this.note = note;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eleve [nom=");
		builder.append(nom);
		builder.append(", note=");
		builder.append(note);
		builder.append("]");
		return builder.toString();
	}
	
		
	
}
