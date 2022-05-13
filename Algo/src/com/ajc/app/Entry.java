package com.ajc.app;

import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		biggerNumber();
		/*           
		 	Écrire un algorithme qui demande successivement 10 nombres à l’utilisateur.  Le programme lui ressortira ensuite le plus grand. 
             Entrez le nombre numéro 1 : 12
             Entrez le nombre numéro 2 : 14
            ...
             Entrez le nombre numéro 10 : 6
             Le plus grand nombre saisi est : 14
            Modifier ensuite l’algorithme pour que le programme affiche de surcroît la position du nombre le plus grand. 
            ex: La position du nombre le plus grand est : 2e nombre saisi.
		 */
		
	} 
	
	public static void biggerNumber() {
		
		int bigger = 0, position = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Saisie du nombre "+i+":");
			int current = sc.nextInt();
			
			if(i == 1 || current > bigger) {
				bigger = current;
				position = i;
			}
		}
		System.out.println("Nombre le plus grand saisie: "+ bigger + " (position: " + position + ")");
		
	}
	
	
	public static int askForAge() {
		System.out.println("Quel est ton age?");
		return sc.nextInt();
	}
	
	public static String askForFirstName() {
		System.out.println("Quel est ton prenom?");
		return sc.next();
	}
	
	public static void displayInfos(String name, int age) {
		System.out.print("Okay " + name +" , tu as donc " + age + " ans ");
		if(age >= 18) {
			System.out.println("et tu es majeur");
		}else {
			System.out.println("et tu es mineur");			
		}
	}
	
}