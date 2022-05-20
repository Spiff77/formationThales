package com.ajc.app.model.game;

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
	public void attack(Humanoid humanoid) {
		humanoid.receiveDamage(getAttackPoint());
	}
	
	public void useRage(Humanoid humanoid) {
		if(rage >= 8) {
			this.rage -= 8;
			humanoid.receiveDamage(getAttackPoint() * 1.5); 
		}else {
			System.out.println("Not enough rage");
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
