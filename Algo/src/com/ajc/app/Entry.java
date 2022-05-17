package com.ajc.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.ajc.app.model.Adresse;
import com.ajc.app.model.City;
import com.ajc.app.model.Horse;
import com.ajc.app.model.Personne;

public class Entry {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		
		ArrayList<String> team = new ArrayList<>();
		
		System.out.println("Welcome que voulez vous faire?");
		
		while(true) {
			displayMenu();
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Name?");
				String name = sc.next();
				team.add(name);
				break;
			case 2: 
				for (String member : team) {
					System.out.println(member);
				}
				break;
			case 3: 
				System.out.println("Qui voulez vous supprimer?");
				for (int i = 0; i < team.size(); i++) {
					System.out.println((i+1) + " - " +team.get(i));
				}
				int value = sc.nextInt();
				team.remove(value - 1);
				break;
		    default: 
		    	System.out.println("Pas compris");
			}
					
					
			
		}
		/**
		 * 
		 * Welcome que voulez vous faire?
		 * 1/ Ajouter un membre
		 * 2/ Lister tous les membres
		 * 3/ Supprimer un membre
		 * 
		 * 3<---
		 * 1: Prenom1
		 * 2: Prenom2
		 * 3: Prenom3
		 * 
		 */
	}
	public static void displayMenu() {
		System.out.println(" * Welcome que voulez vous faire?\n"
				+ "\t * 1/ Ajouter un membre\n"
				+ "\t * 2/ Lister tous les membres\n"
				+ "\t * 3/ Supprimer un membre");
	}
		
		

}

/**
 * 
 * h1
 * h2
 * h3
 * h4 
 */

