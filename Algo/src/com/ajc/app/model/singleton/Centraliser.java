package com.ajc.app.model.singleton;

import java.util.ArrayList;
import java.util.List;

public class Centraliser {

	private static Centraliser INSTANCE;
	private List<Printer> printers = new ArrayList<>();
	private int printerIndex;
	private Centraliser() {}
	
	public static Centraliser getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Centraliser();
		}
		return INSTANCE;
	}
	
	public void add(Printer printer) {
		this.printers.add(printer);
	}
	
	public void print(String content) {
		Printer p;
		if(this.printers.size() == printerIndex) {
			printerIndex = 0;
		}
		p = this.printers.get(printerIndex++);
		p.print(content);
		
	}
	
}
