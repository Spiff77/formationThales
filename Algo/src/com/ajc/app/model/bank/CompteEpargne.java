package com.ajc.app.model.bank;

public class CompteEpargne extends Compte{

	public float taux;

	public CompteEpargne(float solde, float taux) {
		super(solde);
		this.taux = taux;
	}
	
	public float calculInterets() {
		return solde * taux;
	}
	
}