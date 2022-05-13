package com.ajc.app;

import java.util.Scanner;


public class P4 {

	static char[][] constructiongrille(int nbLigne, int nbColonne) {
		char grille[][] = new char[nbLigne][nbColonne];
			for (int i= 0 ; i < (nbLigne) ; i++) {
				for (int j = 0 ; j < (nbColonne) ; j++) {
					grille[i][j] = '.';
				}
			}
		return grille;
	}
	
	static char[][] modifGrille(boolean joueur, int ligne, int colonne, char[][] grille) {
		if (joueur) {
			grille[ligne][colonne]='X';
			return grille;
		}
		else {
			grille[ligne][colonne] = 'O';
			return grille;
		}
	}
	
	static String affichageGrille(int nbLigne, int nbColonne, char[][] grille) {
		String grilleAffichee = "Grille en cours :-";
		for (int i = 0 ; i < nbLigne ; i++) {
			grilleAffichee = grilleAffichee + '-' + grille[i][0];
			for (int j = 1 ; j < nbColonne ; j++) {
				grilleAffichee = grilleAffichee + ' ' + grille[i][j];
			}
		}
		return grilleAffichee;
	}
	
	static int descentePion(int nbLigne, int colonne, char[][] grille) {
		int ligne = (nbLigne-1);
		int i = (nbLigne-1);
		while (i != -1) {
			if (grille[ligne][colonne] == 'X' || grille[ligne][colonne] == 'O'){ 		
				i-=1;
				ligne-=1;
			}
			else
				i = -1;
		}
		return ligne;
	}
	
	static boolean verifVictoire(int nbLigne, int nbColonne, char [][] grille) {

		boolean victoire = false;
		
		for (int i = 0 ; i <= (nbLigne-1) ; i++) {
			for (int j = 0 ; j <= (nbColonne -4) ; j++) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i][j+1] && grille[i][j] == grille [i][j+2] && grille[i][j] == grille [i][j+3]) {
						victoire = true;
					}
				}
			}
		}
		
		for (int j = 0 ; j <= (nbColonne-1) ; j++) {
			for (int i = 0 ; i <= (nbLigne - 4) ; i++) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i+1][j] && grille[i][j] == grille [i+2][j] && grille[i][j] == grille [i+3][j]) {
						victoire = true;
					}
				}
			}
		}
		
		for (int j = 0 ; j <= (nbColonne-4) ; j++) {
			for (int i = 0 ; i <= (nbLigne -4) ; i++) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i+1][j+1] && grille[i][j] == grille [i+2][j+2] && grille[i][j] == grille [i+3][j+3]) {
						victoire = true;
					}
				}
			}
		}
		
		for (int j = (nbColonne - 1) ; j >= 3 ; j--) {
			for (int i = 0 ; i <= (nbLigne -4) ; i++) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i+1][j-1] && grille[i][j] == grille [i+2][j-2] && grille[i][j] == grille [i+3][j-3]) {
						victoire = true;
					}
				}
			}
		}
		
		for (int j = (nbColonne - 1) ; j >= 3 ; j--) {
			for (int i = (nbLigne - 1) ; i >= 3 ; i--) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i-1][j-1] && grille[i][j] == grille [i-2][j-2] && grille[i][j] == grille [i-3][j-3]) {
						victoire = true;
					}
				}
			}
		}
		
		for (int j = 0 ; j <= (nbColonne - 4) ; j++) {
			for (int i = (nbLigne -1) ; i >= 3 ; i--) {
				if (grille[i][j] != '.') {
					if (grille[i][j] == grille [i-1][j+1] && grille[i][j] == grille [i-2][j+2] && grille[i][j] == grille [i-3][j+3]) {
						victoire = true;
					}
				}
			}
		}
		
		return victoire;
	}
	
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Bienvenue sur Puissance 4 pas 3D !");
		System.out.println("Choisissez un nombre de lignes et de colonnes pour votre partie s'il vous plait (nombre de lignes-nombre de colonnes)");
		String nb = clavier.next();
		String[] tableau = nb.split("-");
		int nbLigne = Integer.parseInt(tableau[0]);	
		int nbColonne = Integer.parseInt(tableau[1]);
		
		char grille[][] = constructiongrille(nbLigne, nbColonne);
		
		
		String grilleAffichee = affichageGrille(nbLigne, nbColonne, grille);
		
		for (String grilleAfficheeDivisee: grilleAffichee.split("-")) {
	         System.out.println(grilleAfficheeDivisee);
	    }
		
		int ligne = -1;
		boolean joueur = false;
		boolean victoire = false;

		while (!victoire) {	
			
			joueur = !joueur;
			int choixColonne = 2500;
			
			while (choixColonne > nbColonne || choixColonne < 0) {
			if (joueur) {
				System.out.println("Tour de joueur 1");
				System.out.println("Choisissez dans quelle colonne placer votre pion (entre 1 et " + nbColonne + ")");
				choixColonne = clavier.nextInt();
			}
			
			else {
				System.out.println("Tour de joueur 2");
				System.out.println("Choisissez dans quelle colonne placer votre pion (entre 1 et " + nbColonne + ")\"");
				choixColonne = clavier.nextInt();
			}
			}
		
			ligne = descentePion(nbLigne, (choixColonne-1), grille);
		
			grille = modifGrille(joueur, ligne, (choixColonne-1), grille);
		
			grilleAffichee = affichageGrille(nbLigne, nbColonne, grille);
		
			for (String grilleAfficheeDivisee: grilleAffichee.split("-")) {
	         System.out.println(grilleAfficheeDivisee);
			}
			
			victoire = verifVictoire(nbLigne,nbColonne,grille);
		}
		
		if (joueur) {
			System.out.println("Le joueur 1 remporte la partie !");
		}
		else {
			System.out.println("Le joueur 2 remporte la partie !");
		}
		
		clavier.close();
	}
}
