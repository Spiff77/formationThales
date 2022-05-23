package com.ajc.model.cars;

public class Avion implements Roulant, Volant{


	@Override
	public void avancer() {
		System.out.println("Avance");
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

	@Override
	public void decoller() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atterir() { 
		// TODO Auto-generated method stub
		
	}

}
