package com.ajc.app.model.bank;

public class RegisteredUserCard implements Card {

	private String cardNumber;
	
	public RegisteredUserCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void connect() {
		System.out.println("Bank connection with: "+cardNumber);
	}

}
