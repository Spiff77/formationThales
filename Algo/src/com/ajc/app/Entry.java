package com.ajc.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.ajc.app.model.Orc;

public class Entry {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		
		HashSet<Orc> team = new HashSet<>();
		
		Orc o1 = new Orc("a",20, 20);
		Orc o2 = new Orc("b",20, 20);
		
		team.add(o1);
		team.add(o2);
		
		
		System.out.println("Welcome que voulez vous faire?");
		
		while(true) {
			displayMenu();
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Name?");
				String name = sc.next();
				System.out.println("health?");
				int health = sc.nextInt();
				System.out.println("Force?");
				int force = sc.nextInt();
				if(!team.add(new Orc(name, health, force))) {
					System.out.println("Ce nom existe dejà");
				}
				break;
			case 2: 
				for (Orc member : team) {
					System.out.println(member);
				}
				break;
			case 3: 
				System.out.println("Qui voulez vous supprimer?");
				for (Orc member : team) {
					System.out.println(member.getName());
				}
				String nameToDelete = sc.next();
				
				Iterator<Orc> it = team.iterator();
				
				while(it.hasNext()) {
					Orc o = it.next();
					if(o.getName().equals(nameToDelete)) {
						it.remove();
					}
				}
				
				break;
		    default: 
		    	System.out.println("Pas compris");
			}			
		}

	}
	public static void displayMenu() {
		System.out.println(" * Welcome que voulez vous faire?\n"
				+ "\t * 1/ Ajouter un orc\n"
				+ "\t * 2/ Lister tous les orcs\n"
				+ "\t * 3/ Supprimer un orc");
	}
		
		

}

/**
 * 
 * h1
 * h2
 * h3
 * h4 
 */

