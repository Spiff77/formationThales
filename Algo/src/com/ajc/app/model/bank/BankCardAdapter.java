package com.ajc.app.model.bank;

public class BankCardAdapter implements Card{

	private BankCard bankCard;
	
	public BankCardAdapter(String accountNumber) {
		this.bankCard = new BankCard(accountNumber);
	}

	@Override
	public void connect() {
		bankCard.startTransaction();
	}

}
