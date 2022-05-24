package com.ajc.app.model.game;

import com.ajc.app.model.game.exception.GenevaConventionException;
import com.ajc.app.model.game.exception.NotEnoughRageException;

public class Berseker extends Humanoid{

	private int rage = 0;

	public Berseker(String name, double health, int force) {
		super(name, health, force);
	}
	
	public Berseker(String name, double health, int force, int rage) {
		super(name, health, force);
		this.rage = rage;
	}
	
	@Override
	public void receiveDamage(double damage) {
		this.rage += 3;
		super.receiveDamage(damage);
	}

	@Override
	public void attack(Attackable attackable) throws GenevaConventionException {
		if(attackable instanceof Humanoid && ((Humanoid)attackable).getHealth() <= 0) {
			throw new GenevaConventionException();
		}
		attackable.receiveDamage(getAttackPoint());
	}
	
	public void useRage(Humanoid humanoid) throws NotEnoughRageException {
		if(rage >= 8) {
			this.rage -= 8;
			humanoid.receiveDamage(getAttackPoint() * 1.5); 
		}else {
			throw new NotEnoughRageException();				
		
		}
	}
	
	public void addRage(int rage) {
		this.rage += rage;
	}
	
	private double getAttackPoint() {
		return this.force * 1.2;
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Berseker [rage=");
		builder.append(rage);
		builder.append(", name=");
		builder.append(name);
		builder.append(", health=");
		builder.append(health);
		builder.append(", force=");
		builder.append(force);
		builder.append("]");
		return builder.toString();
	}
	
	
}
