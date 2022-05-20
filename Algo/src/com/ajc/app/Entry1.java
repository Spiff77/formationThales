package com.ajc.app;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ajc.app.model.Animal;
import com.ajc.app.model.Cat;
import com.ajc.app.model.Dog;
import com.ajc.app.model.bank.Client;
import com.ajc.app.model.bank.Compte;
import com.ajc.app.model.bank.CompteEpargne;
import com.ajc.app.model.bank.CompteSimple;
import com.ajc.app.model.cars.Boat;
import com.ajc.app.model.cars.Car;
import com.ajc.app.model.cars.Owner;
import com.ajc.app.model.cars.Plane;
import com.ajc.app.model.cars.Vehicule;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Owner o = new Owner("JC");
		o.add(new Car(30, "peugeot"));
		o.add(new Car(30, "renault"));
		o.add(new Boat(30, "pajot"));
		o.add(new Plane(30, "boeing"));
		
		
		for (Vehicule v: o.getVehicles()) {
			v.start();
			
			if(v instanceof Boat) {
				((Boat) v).sail();
			}
			if(v instanceof Plane) {
				((Plane) v).fly();
			}
			
			v.stop();
		}
		
		o.startAll();
	} 

	public static void displayMenu() {
		System.out.println(" * Welcome que voulez vous faire?\n"
				+ "\t * 1/ Ajouter un orc\n"
				+ "\t * 2/ Lister tous les orcs\n"
				+ "\t * 3/ Supprimer un orc");
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

