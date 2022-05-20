package com.ajc.app.model.bank;

public class CompteSimple extends Compte{
	
	private float decouvert;
	
	public CompteSimple(float solde, float decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void retirer(float amount) {
		if(amount < solde + decouvert) {
			this.solde -= amount;
		}
	}
	
}
