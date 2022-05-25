package com.ajc.app.model.game;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<Observer> observers = new ArrayList<>();
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void notifAll(Action action);
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

}
