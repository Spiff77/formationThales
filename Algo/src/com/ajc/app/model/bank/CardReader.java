package com.ajc.app.model.bank;

public class CardReader {

	public CardReader() {
		// TODO Auto-generated constructor stub
	}
	
	public void read(Card card) {
		card.connect();
	}
}
