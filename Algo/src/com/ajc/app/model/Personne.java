package com.ajc.app.model;

import java.util.ArrayList;

public class Personne {
	
	private int age = 10;
	public String prenom;
	private String nom;
	private ArrayList<Adresse> adresses = new ArrayList<Adresse>();
	private Horse horse;
	
	
	public Personne(Personne p) {
		this.prenom = p.prenom;
		this.nom = p.nom;
		this.age = p.age;
	}
	
	public Personne(String prenom, String nom, Adresse adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresses.add(adresse);
	}
	
	
	public Personne(String prenom, String nom, int age, Adresse adresse) {
		this(prenom, nom, adresse);
		System.out.println("C2");
		this.setAge(age);
	}
	
	public void add(Adresse adresse) {
		this.adresses.add(adresse);
	}
	
	public Personne create(String prenom, String nom, int age, Adresse adresse) {
		return new Personne(prenom, nom, age, adresse);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age > 100 ? 100 : age;
	}
	
	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(ArrayList<Adresse> adresse) {
		this.adresses = adresse;
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
		return "Personne [age=" + age + ", prenom=" + prenom + ", nom=" + nom + ", adresses=" + adresses + "]";
	}
	
}
