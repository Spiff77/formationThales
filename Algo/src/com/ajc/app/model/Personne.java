package com.ajc.app.model;

import java.util.ArrayList;

public class Personne {
	
	private int age = 10;
	public String prenom;
	private String nom;
	private ArrayList<Adresse> adresse = new ArrayList<Adresse>();
	private Horse horse;
	
	
	public Personne(Personne p) {
		this.prenom = p.prenom;
		this.nom = p.nom;
		this.age = p.age;
	}
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	
	public Personne(String prenom, String nom, int age) {
		this(prenom, nom);
		System.out.println("C2");
		this.setAge(age);
	}
	
	public Personne create(String prenom, String nom, int age) {
		return new Personne(prenom, nom, age);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age > 100 ? 100 : age;
	}
	

	public ArrayList<Adresse> getAdresse() {
		return adresse;
	}

	public void setAdresse(ArrayList<Adresse> adresse) {
		this.adresse = adresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Horse getHorse() {
		return horse;
	}

	public void setHorse(Horse horse) {
		this.horse = horse;
	}

	@Override
	public String toString() {
		return "Personne [age=" + age + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
}
