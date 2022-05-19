package com.ajc.app.model.resto;

public enum Eplat {
	
	SALADE("Salade césar", 8), COUSCOUS("Couscous", 10), MAGRET("Magret", 18);
	
	private String name;
	private float price;
	
	
	private Eplat(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

}
