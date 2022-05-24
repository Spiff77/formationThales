package com.ajc.app.resto.model;

public enum Edessert {
	
	MOUSSE("Mousse au chocolat", 5), GLACE("Glace au citron", 3);
	
	private String name;
	private float price;
	
	
	private Edessert(String name, float price) {
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
