package com.ajc.app.parking.model.adapter;

public class RadioK7 {

	private K7Reader K7reader;
	
	public RadioK7(K7Reader K7Reader) {
		this.K7reader = K7Reader;
	}
	
	public void playK7() {
		this.K7reader.read();
	}

}
