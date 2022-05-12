package com.ajc.app;

import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int age = askForAge();
		String firstName = askForFirstName();
		displayInfos(firstName, age);
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
		System.out.println("Okay " + name +" , tu as donc " + age + " ans");
	}
	
}