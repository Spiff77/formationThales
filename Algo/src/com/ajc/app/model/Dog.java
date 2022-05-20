package com.ajc.app.model;

public class Dog extends Animal{


	private String pedigre;
	


	public Dog(String name, String pedigre) {
		super(name);
		this.pedigre = pedigre;
	}

	public void mangeDesCroquettes() {
		System.out.println("Canigou miamiam");
	}
	
	@Override
	public void sayHello() {
		System.out.println("Le chien fait waf waf");

	}

	public String getPedigre() {
		return pedigre;
	}

	public void setPedigre(String pedigre) {
		this.pedigre = pedigre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [pedigre=");
		builder.append(pedigre);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


	
	
	
}
