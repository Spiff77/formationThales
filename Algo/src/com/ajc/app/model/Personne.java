package com.ajc.app.model;

public class Personne {
	
	private int age = 10;
	public String prenom;
	private String nom;
	
	
	public Personne(Personne p) {
		this.prenom = p.prenom;
		this.nom = p.nom;
		this.age = p.age;
	}
	
	public Personne(String prenom, String nom) {
		System.out.println("C1");
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

	@Override
	public String toString() {
		return "Personne [age=" + age + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	
	
}
