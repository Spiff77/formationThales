package com.ajc.app.model;

public class Personne {
	
	private int age = 10;
	public String prenom;
	private String nom;
	private Adresse adresse;
	private Horse horse;
	
	
	public Personne(Personne p) {
		this.prenom = p.prenom;
		this.nom = p.nom;
		this.age = p.age;
	}
	
	public Personne(String prenom, String nom, Adresse adresse) {
		System.out.println("C1");
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public Personne(String prenom, String nom, int age, Adresse adresse) {
		this(prenom, nom, adresse);
		System.out.println("C2");
		this.setAge(age);
	}
	
	public Personne create(String prenom, String nom, int age,  Adresse adresse) {
		return new Personne(prenom, nom, age, adresse);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age > 100 ? 100 : age;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
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
