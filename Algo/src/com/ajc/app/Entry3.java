package com.ajc.app;

import java.util.Iterator;
import java.util.Scanner;

public class Entry3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean playerOne = true;
		
		Boolean[][] grid = generateGrid();
		displayGrid(grid);
		while(true) {
			
			
			System.out.println((playerOne ? "Player 1 ":"Player 2") + " | Colonne ?");
			int x = sc.nextInt();
			
			grid[getYAxisEmptySlot(grid, x-1)][x-1] = playerOne;
			playerOne = !playerOne;
			displayGrid(grid);
			
			if(verifVictoire(grid)) {
				System.out.println("Victoire");
			}
		
		}	
	}
	
	static boolean verifVictoire(Boolean[][] grille) {


		for (int i = 0 ; i <= grille.length - 1; i++) {
			for (int j = 0 ; j <= grille[i].length - 4; j++) {
				if (grille[i][j] != null) {
					if (grille[i][j] == grille [i][j+1] && grille[i][j] == grille [i][j+2] && grille[i][j] == grille [i][j+3]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void displayGrid(Boolean[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] != null) {
					System.out.print(grid[i][j] ? "X" : "O");					
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	

	public static Boolean[][] generateGrid() {

		System.out.println("Size (ex: 4-5)");
		String size = sc.next();
		String sizes[] = size.split("-");
		return new Boolean[Integer.parseInt(sizes[1])][Integer.parseInt(sizes[0])];
	}
	
	static int getYAxisEmptySlot(Boolean[][] grille, int colonne) {
		
		for (int i = grille.length - 1; i >= 0; i--) {
			if(grille[i][colonne] == null) {
				return i;
			}
		}
		return -1;
		
		
	}
}
