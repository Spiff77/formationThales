package com.ajc.app;

import java.util.Scanner;

public class Entry3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean[][] tabs = new boolean[5][5];
		while(true) {
			
			
			System.out.println("pos X?");
			int x = sc.nextInt();
			System.out.println("pos Y?");
			int y = sc.nextInt();
			
			tabs[y-1][x-1] = true;
			for (int i = 0; i < tabs.length; i++) {
				for (int j = 0; j < tabs[i].length; j++) {
					System.out.print(tabs[i][j] ? "X" : ".");
				}
				System.out.println();

			}
			

			
			
			System.out.println("continue? (y/n)");
			if(sc.next().equalsIgnoreCase("n")) {
				break;
			}
		
		}	
		System.out.println("Bye");
		
	}
}
