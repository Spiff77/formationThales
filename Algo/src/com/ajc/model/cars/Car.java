package com.ajc.model.cars;

import java.io.Serializable;

public class Car implements Roulant, Serializable{

	private int gaz;
	

	public Car(int gaz) {
		super();
		this.gaz = gaz;
	}

	@Override
	public void avancer() throws Exception {
		if(gaz <= 0) {
			throw new Exception("Pas assez d'esence");
		}else {
			System.out.println("vroom");
			gaz -= 1;
		}

		
	}

	@Override
	public void stopper() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
		
	}

	@Override
	public void reculer() {
		System.out.println("Recule");
		// TODO Auto-generated method stub
	}

}
