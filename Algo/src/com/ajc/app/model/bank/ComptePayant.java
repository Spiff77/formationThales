package com.ajc.app.model.bank;

public class ComptePayant extends Compte{
	
	
	public ComptePayant(float solde) {
		super(solde);
	}

	@Override
	public void retirer(float amount) {
		if(amount + 1 <= solde) {
			this.solde -= (amount + 1);
		}
	}
	
	@Override
	public void verser(float amount) {
		super.verser(amount - 1);
	}
	
}
