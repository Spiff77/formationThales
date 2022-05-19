package com.ajc.app.model.resto;

public enum Eboisson {
	
	EAU("Eau Minérale", 1), JUSDORANGE("Jus d'orange", 2), BIERE("Biere", 2.5f);
	
	private String name;
	private float price;
	
	
	private Eboisson(String name, float price) {
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
