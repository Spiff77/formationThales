package com.ajc.app.model.bank;

public class Compte {
	private int id;
	protected float solde;
	private static int countCompte;

	public Compte(float solde) {
		this.id = ++countCompte;
		this.solde = solde;
	}
	
	public void retirer(float amount) {
		if(this.solde - amount > 0) {
			this.solde -= amount;
		}else {
			System.out.println("Fonds insufisants");
		}
	}
	
	public void verser(float amount) {
		this.solde += amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSolde() {
		return solde;
	}


	public static int getCountCompte() {
		return countCompte;
	}

	public static void setCountCompte(int countCompte) {
		Compte.countCompte = countCompte;
	}
	
	
	
}
