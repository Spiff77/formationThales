package com.thales.formation.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Option {

	private int nbrWheels;
	
	private boolean autoradio;
	
	private boolean turbo;

	public Option(int nbrWheels, boolean autoradio, boolean turbo) {
		super();
		this.nbrWheels = nbrWheels;
		this.autoradio = autoradio;
		this.turbo = turbo;
	}
	
	public Option() {
	}
	
	


}
