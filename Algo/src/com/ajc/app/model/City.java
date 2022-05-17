package com.ajc.app.model;

public class City {
	private String name;
	private String country;
	private double population;
	private String category;
	private boolean capital;
	
	public City(String name, String country, double population, boolean capital) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
		this.capital = capital;
		this.definCategory();
	}

	private void definCategory() {
		if (this.capital) {
			this.category = population > 6 ? "Big" : "Small";
		} else {
			this.category = population > 7 ? "Big" : "Small";
		}
	}
	
	public String makeCompare(City c) {
		
		if(this.population > c.population) {
			return "The city " + this.name + " is bigger than " + c.name;
		}else if(this.population < c.population) {
			return "The city " + this.name + " is smaller than " + c.name;
		}else {			
			return "The city " + this.name + " is the same as " + c.name;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
		this.definCategory();
	}

	public String getCategory() {
		return category;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
		this.definCategory();

	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + ", category=" + category
				+ ", capital=" + capital + "]";
	}
	
	
}
