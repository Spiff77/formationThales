package com.ajc.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ajc.app.model.Adresse;
import com.ajc.app.model.Orc;
import com.ajc.app.model.Personne;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		
		Adresse a = new Adresse(12, "b", "b");
		Personne p = new Personne("a", "a", a);
		
		p.add(a);
		
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

