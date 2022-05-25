package com.ajc.app.model;

public class PersonneBuilder {

	Personne p;
	
	public PersonneBuilder(String nom, String prenom) {
		this.p = new Personne(nom, prenom);
	}
	
	public PersonneBuilder setAge(int age) {
		this.p.setAge(age);
		return this;
	}
	public PersonneBuilder isDead() {
		this.p.setAlive(false);
		return this;
	}
	
	public PersonneBuilder addAdresse(Adresse a) {
		this.p.add(a);
		return this;
	}
	
	public Personne build() {
		return this.p;
	}

}
