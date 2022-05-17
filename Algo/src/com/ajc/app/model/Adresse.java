package com.ajc.app.model;

public class Adresse {
	private int no;
	private String numRue;
	private String city;
	
	public Adresse(int no, String numRue, String city) {
		super();
		this.no = no;
		this.numRue = numRue;
		this.city = city;
	}
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Adresse [no=" + no + ", numRue=" + numRue + ", city=" + city + "]";
	}

	
	
	
	
}
