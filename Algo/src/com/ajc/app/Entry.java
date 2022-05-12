package com.ajc.app;

import java.util.Iterator;
import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("i="+i);
			
			for (int j = 0; j < 3; j++) {
				System.out.println("j="+j);
				if(j==2) {
					break;
				}
			}
			
		}

		
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