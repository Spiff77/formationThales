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
import com.ajc.app.model.singleton.Centraliser;
import com.ajc.app.model.singleton.Computer;
import com.ajc.app.model.singleton.Printer;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		
		Printer p1 = new Printer("Epson");
		Printer p2 = new Printer("Canon");
		
		Centraliser.getInstance().add(p1);
		Centraliser.getInstance().add(p2);
		
		Computer c1 = new Computer("compta");
		Computer c2 = new Computer("dev");
		Computer c3 = new Computer("sales");

		
		c1.print("toto");
		c3.print("toto");
		c2.print("toto");
		c2.print("toto");
		c3.print("toto");
		c1.print("toto");
		c1.print("toto");
		
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

