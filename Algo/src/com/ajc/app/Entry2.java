package com.ajc.app;

import java.util.Scanner;

public class Entry2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		calculateSwitch();
	}
	
	public static void calculateIf(){
		System.out.println("WELCOME TO SUPERCALCULTAOR 2000+");
		
		do {
			System.out.println("Saisir la première valeur");
			float nb1 = sc.nextFloat();
			System.out.println("Saisir la seconde valeur");
			float nb2 = sc.nextFloat();
			System.out.println("Saisir l'opérateur (*-+/) ou Q pour quitter");
			String op = sc.next();
			
			if(op.equals("*")) {
				multiplication(nb1, nb2);
			}else if(op.equals("/")) {
				division(nb1, nb2);
			}else if(op.equals("-")) {
				soustraction(nb1, nb2);
			}else if(op.equals("+")) {
				addition(nb1, nb2);
			}else if(op.equalsIgnoreCase("Q")) {
				break;
			}else {
				System.out.println("Opérateur non valide");
			}
		}while(true);
		
		System.out.println("Merci, à bientôt");
	}
	
	public static void calculateSwitch(){
		boolean running = true;
		System.out.println("WELCOME TO SUPERCALCULTAOR 2000+");
		
		do {
			System.out.println("Saisir la première valeur");
			float nb1 = sc.nextFloat();
			System.out.println("Saisir la seconde valeur");
			float nb2 = sc.nextFloat();
			System.out.println("Saisir l'opérateur (*-+/) ou Q pour quitter");
			String op = sc.next();
			
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
				case "Q" : 
					running = false;
					break;
				default :
					System.out.println("Opérateur non valide");
			}
		
		}while(running);
		
		System.out.println("Merci, à bientôt");
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