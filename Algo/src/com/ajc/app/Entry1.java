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
import com.ajc.app.model.game.Berseker;
import com.ajc.app.model.game.Warrior;
import com.ajc.app.model.game.Wizard;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Berseker b = new Berseker("b", 100, 15);
		Wizard w = new Wizard("w", 100, 6, 10);
		Warrior wa = new Warrior("wa", 100, 10);
		
		
		System.out.println(b);
		System.out.println(wa);
		wa.attack(b);
		wa.attack(b);
		wa.attack(b);
		b.useRage(wa);
		System.out.println(b);
		System.out.println(wa);
		
		System.out.println(b);
		System.out.println(w);
		
		w.attack(b);
		w.attack(b);
		w.attack(b);

		b.attack(w);
		b.attack(w);
		b.attack(w);
		b.attack(w);
		b.attack(w);
		
		System.out.println(b);
		w.spellCast(b);
		System.out.println(b);
		System.out.println(w);
		

		
	
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

