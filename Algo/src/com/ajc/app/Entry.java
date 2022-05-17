package com.ajc.app;

import java.util.Scanner;

import com.ajc.app.model.Personne;

public class Entry {
		
	public static void main(String[] args) {
		
		Personne p1 = new Personne("Thomas", "Lhomme");
		Personne[] pers = new Personne[10];
		
		for (int i = 0; i < pers.length; i++) {
			Personne personne = pers[i];
			System.out.println(personne);
			pers[0].getAge();
			
		}
		
		
		p1.setNom("dfdsfs");
		System.out.println(p1.getNom()); // r
		
		//p1.setAge(50);
		System.out.println(p1);
		
		
		Personne personnes[] = new Personne[3];
		/*personnes[0] = new Personne("Thomas", "Lhomme", 36);
		personnes[1] = new Personne("Antoine", "Lhomme", 36);
		personnes[2] = new Personne("Cyril", "Lhomme", 36);*/
		
		//personnes[0].create("", null, 3);
		
		for (int i = 0; i < personnes.length; i++) {
			if(personnes[i] != null) {				
				// System.out.println(personnes[i]);
			}
		}
		
		for (Personne personne : personnes) {
			if(personne != null) {				
				// System.out.println(personne);
			}
		}

	}
}