package com.ajc.app.model;

public class BankInfo {
	
	private int number;
	private String bankName;
	
	public BankInfo(int number, String bankName) {
		super();
		this.number = number;
		this.bankName = bankName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "BankInfo [number=" + number + ", bankName=" + bankName + "]";
	}

	
	
}
