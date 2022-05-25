package com.ajc.app.parking.model.adapter;

public class K7 implements K7Reader{

	private int duration;
	
	public K7() {
		//
	}

	@Override
	public void read() {
		System.out.println("Lecture K7");
	}

}
