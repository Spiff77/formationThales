package com.ajc.app.model.game;

public abstract class Humanoid {

	protected String name;
	protected double health;
	protected int force;
	
	public Humanoid(String name, double health, int force) {
		super();
		this.name = name;
		this.health = health;
		this.force = force;
	}
	
	public void receiveDamage(double damage) {
		this.health -= damage;
	}

	public abstract void attack(Humanoid humanoid);

	public boolean isAlive() {
		return health > 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Humanoid [name=");
		builder.append(name);
		builder.append(", health=");
		builder.append(health);
		builder.append(", force=");
		builder.append(force);
		builder.append("]");
		return builder.toString();
	}	
}
