package com.ajc.app;

import java.util.Scanner;

public class Entry2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Saisir la première valeur");
		float nb1 = sc.nextFloat();
		System.out.println("Saisir la seconde valeur");
		float nb2 = sc.nextFloat();
		System.out.println("Saisir l'opérateur (*-+/)");
		String op = sc.next();
		
		if(op.equals("*")) {
			multiplication(nb1, nb2);
		}else if(op.equals("/")) {
			division(nb1, nb2);
		}else if(op.equals("-")) {
			soustraction(nb1, nb2);
		}else if(op.equals("+")) {
			addition(nb1, nb2);
		}else {
			System.out.println("Opérateur non valide");
		}
		
		
		switch(op) {
			case "*" : 
				multiplication(nb1, nb2);
				break;
			case "/" : 
				division(nb1, nb2);
				break;
			case "-" : 
				soustraction(nb1, nb2);
				break;
			case "+" : 
				addition(nb1, nb2);
				break;
			default :
				System.out.println("Opérateur non valide");
		}
	}
	
	public static void addition(float a, float b) {
		System.out.println("Resultat addition: " + (a + b));
	}

	public static void soustraction(float a, float b) {
		System.out.println("Resultat soustraction: " + (a - b));
	}
	public static void multiplication(float a, float b) {
		System.out.println("Resultat multiplication: " + (a * b));
	}
	public static void division(float a, float b) {
		System.out.println("Resultat division: " + (a / b));
	}
	
}