package com.ajc.app;

import java.util.Scanner;

public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		boolean[][] tab = generateTab();
		
		while(true) {
			displayGrid(tab);
			System.out.print("Colonne ?");
			int x = sc.nextInt();
			
			tab[getYAxisEmptySlot(tab, x - 1)][x-1] = true;
			
		}
	} 
	
	public static void displayGrid(boolean[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] ? "X" : ".");
			}
			System.out.println();
		}
	}
	
	public static int getYAxisEmptySlot(boolean[][] tab, int colonne) {
		for (int i = tab.length -1; i >= 0; i--) {
			if(!tab[i][colonne]) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean[][] generateTab(){
		System.out.println("Taille de la grille? ex (5-3)");
		String sizeStr = sc.next();
		String[] sizeTab = sizeStr.split("-");
		
		boolean[][] tab = new boolean[Integer.parseInt(sizeTab[1])]
		                             [Integer.parseInt(sizeTab[0])];
		
		return tab;
	}
	
	public static void zeroAtEnd() {
		int[] tab = {5,5,1,0,3,0,5,0,6};
		int index = 0;
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] != 0) {
				tab[index] = tab[i];
				if(index != i) {
					tab[i] = 0;
				}
				index++;
			}
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		
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
	
	public static void valueSum() {
		
		int numbers[] = {2,7,4,-5,11,5,20};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == 15) {					
					System.out.println(numbers[i] + "+" + numbers[j] + "=" + 15);
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