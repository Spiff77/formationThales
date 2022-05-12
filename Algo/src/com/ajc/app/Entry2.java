package com.ajc.app;

import java.util.Scanner;

public class Entry2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float nb1 = sc.nextFloat();
		float nb2 = sc.nextFloat();
		
		addition(nb1, nb2);
		soustraction(nb1, nb2);
		division(nb1, nb2);
		multiplication(nb1, nb2);

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