package com.ajc.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ajc.app.model.Orc;
import com.ajc.app.model.Personne;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		
		HashMap<Orc, List<Orc>> teams = new HashMap<>();
		
		Orc c1 = new Orc("aa", 100, 10);
		Orc c2 = new Orc("bb", 100, 10);
		
		ArrayList<Orc> t1 = new ArrayList<Orc>();
		t1.add(new Orc("a1",100, 30));
		t1.add(new Orc("a2",100, 30));
		t1.add(new Orc("a3",100, 30));
		
		teams.put(c1, t1);
		
		teams.put(c2, Arrays.asList(
					new Orc(30,20),
					new Orc(30,20),
					new Orc(50,10)
				));
		
		Set<Orc> chefs = teams.keySet();
		int count = 0;
		
		for (Orc orcChief : chefs) {
			System.out.println("Chef equipe " + ++count + ":" + orcChief.getName());
			List<Orc> team = teams.get(orcChief);
			
			for (Orc orc : team) {
				System.out.println("\t"+orc.getName() + "("+ orc.getHealth()+")");
			}
		}
		
		Set<java.util.Map.Entry<Orc, List<Orc>>> entries = teams.entrySet();
		
		for (java.util.Map.Entry<Orc, List<Orc>> entry : entries) {
			Orc orcChief = entry.getKey(); 
				System.out.println("Chef equipe " + ++count + ":" + orcChief.getName());
				List<Orc> team = entry.getValue();
				
				for (Orc orc : team) {
					System.out.println("\t"+orc.getName() + "("+ orc.getHealth()+")");
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
 * On veut une equipe d'Orcs associé à un chef (Orc également)
 * 
 * Chef equipe 1: Jean
 *  - Jacques (50hp)
 *  - Paule (40hp)
 * Chef equipe 2: Pierre
 *  - Michel (50hp)
 *  - JC (40hp)
 */

