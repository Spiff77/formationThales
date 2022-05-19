package com.ajc.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.ajc.app.model.Adresse;
import com.ajc.app.model.Eleve;
import com.ajc.app.model.Orc;
import com.ajc.app.model.Parking;
import com.ajc.app.model.Personne;
import com.ajc.app.model.Product;
import com.ajc.app.model.Singleton;
import com.ajc.app.model.WeekDay;
import com.ajc.app.model.resto.Commande;
import com.ajc.app.model.resto.Eboisson;
import com.ajc.app.model.resto.Edessert;
import com.ajc.app.model.resto.Eplat;
import com.ajc.app.model.singleton.Centraliser;
import com.ajc.app.model.singleton.Computer;
import com.ajc.app.model.singleton.Printer;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Eboisson boissonClient = null;
		
		Eboisson[] boisson = Eboisson.values();
		
		for (int i = 0; i < boisson.length; i++) {
			System.out.println(i + "/" +boisson[i].getName());
		}
		
		Commande c = new Commande("1",Eboisson.valueOf(sc.next().toUpperCase()), Eplat.COUSCOUS,Edessert.MOUSSE);

		System.out.println("Le prix total de la commande " + c.getName() + " est de " +c.calculPrixTotal());
	
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

