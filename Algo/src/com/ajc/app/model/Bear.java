package com.ajc.app.model;

public class Bear extends AnimalCarnivor{


	private String pedigre;
	
	public Bear(String name, String pedigre) {
		super(name);
		this.pedigre = pedigre;
	}

	public void mangeDesCroquettes() {
		System.out.println("Canigou miamiam");
	}
	
	@Override
	public void manger() {
		System.out.println("Miam la brebis");
	}
	
	@Override
	public void sayHello() {
		System.out.println("wafwaf");
		
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
