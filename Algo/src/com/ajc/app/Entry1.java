package com.ajc.app;

import com.ajc.app.parking.model.Parking;
import com.ajc.app.parking.model.observer.CitySign;
import com.ajc.app.parking.model.RegisteredCar;
import com.ajc.app.parking.model.Vehicle;


public class Entry1 {
	
	public static void main(String[] args) {
		Parking p = new Parking<Vehicle>("CDG", "JeanClaude");
		
		CitySign c1 = new CitySign();
		CitySign c2 = new CitySign();
		
		p.attach(c1);
		p.attach(c2);
		
		p.notifAll();
		p.park(new RegisteredCar("sffs", "sfdfs"));
	}
}

/**
 * On veut une equipe d'Orcs associé à un chef (Orc également)
 * 
 * Chef equipe 1: Jean
 *  - Jacques (50hp)
 *  - Paule (40hp)
 * Chef equipe 2: Pierre
 *  - Michel (50hp)
 *  - JC (40hp)
 */

