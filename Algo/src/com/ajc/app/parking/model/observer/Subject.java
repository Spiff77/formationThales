package com.ajc.app.parking.model.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	public abstract void notifAll();
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

}
