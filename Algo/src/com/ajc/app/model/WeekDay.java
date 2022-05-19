package com.ajc.app.model;

public enum WeekDay {
	
	MONDAY("Monday", "MON"), TUESDAY("Tuesday", "TUE"), WEDNESDAY("Wednesday", "WED");

	private String literal;
	private String shortDay;
	
	private WeekDay(String literal, String shortDay) {
		this.literal = literal;
		this.shortDay = shortDay;
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public String getShortDay() {
		return shortDay;
	}

	public void setShortDay(String shortDay) {
		this.shortDay = shortDay;
	}
	
	
	

}
