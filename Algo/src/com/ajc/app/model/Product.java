package com.ajc.app.model;

public class Product {

	private int id;
	private static int count = 0;
	private String name;
	private float price;
	private static float taux = 20;
	
	public Product(String name, float price) {
		super();
		this.id = ++count;
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

	public static float getTaux() {
		return taux;
	}

	public static void setTaux(float taux) {
		Product.taux = taux;
	}
	
	public float getPriceTTC() {
		return this.price * (1 + Product.taux / 100);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
