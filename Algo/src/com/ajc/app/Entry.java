package com.ajc.app;

import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*String nom1 = sc.nextLine();
		String nom2 = sc.nextLine();*/
		
		
		int level = 1;
		int subLevel = 2;
		String levelstr = level == 1 ? "INFO" : "MINOR"; // 1: info 2: minor 
		
		int age = sc.nextInt();
		
		String etat = age >= 18 ? "MAJEUR" : "MINEUR";
		
		System.out.println("ETAT: "+etat);
		
		
		if(level == 1) {
			levelstr = "INFO";
		}else {
			levelstr = "MINOR";
		}
		
		/*int age = askForAge();
		
		String firstName = askForFirstName();
		displayInfos(firstName, age);*/
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