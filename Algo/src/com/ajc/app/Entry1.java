package com.ajc.app;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ajc.app.model.Dog;
import com.ajc.app.model.bank.Client;
import com.ajc.app.model.bank.Compte;
import com.ajc.app.model.bank.CompteEpargne;
import com.ajc.app.model.bank.CompteSimple;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Client c1 = new Client("sdfs", "fsf", new CompteSimple(200, 50));
		c1.add(new CompteEpargne(200, .02f));
		c1.add(new Compte(200));
		
		c1.getComptes().stream().forEach(System.out::println);
		
		System.out.println(c1.calculTotalAvoirs());
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

