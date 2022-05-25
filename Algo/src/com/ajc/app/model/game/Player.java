package com.ajc.app.model.game;


public class Player extends Subject{
	
	@Override
	public void notifAll(Action action) {
		this.observers.stream().forEach(o -> o.update(Action.HEAL));
	}
	
	public void addWarrior(String name, double health, int force) {
		Warrior w = new Warrior(name, health, force);
		this.attach(w);
		Map.getInstance().add(w);
	}

}
