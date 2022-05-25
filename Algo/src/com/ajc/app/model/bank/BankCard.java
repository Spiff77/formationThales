package com.ajc.app.model.bank;

public class BankCard {
	
	private String accountNumber;

	
	public BankCard(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void startTransaction() {
		System.out.println("Starting Transaction with account " + this.accountNumber);
	}

}
