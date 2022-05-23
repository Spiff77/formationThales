package com.ajc.model.cars;

public class Car implements Roulant{

	private int gaz;
	

	@Override
	public void avancer() {
		if(gaz <+ 0) {
			System.out.println("Pas assez d'essence");
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
