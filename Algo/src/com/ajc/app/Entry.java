package com.ajc.app;

import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*String nom1 = sc.nextLine();
		String nom2 = sc.nextLine();*/
		
		int level = 3; // 1: info 2: minor 3: major 4: critical
		
		switch(level) {
			case 1 :
				System.out.println("INFO");
				break;
			case 2 :
				System.out.println("MINOR");
				break;
			case 3 :
				System.out.println("MAJOR");
				break;
			case 4 :
				System.out.println("CRITICAL");
				break;
			default :
				System.out.println("UNKNOW");
			
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