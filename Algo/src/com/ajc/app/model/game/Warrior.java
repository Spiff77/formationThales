package com.ajc.app.model.game;

public class Warrior extends Humanoid{

	private boolean doubleAttackReady;
	
	public Warrior(String name, double health, int force) {
		super(name, health, force);
	}

	@Override
	public void attack(Humanoid humanoid) {
		this.doubleAttackReady = true;
		humanoid.receiveDamage(getAttackPoint());
	}

	public void doubleAttack(Humanoid humanoid) {
		if(this.doubleAttackReady) {
			for (int i = 0; i < 2; i++) {
				humanoid.receiveDamage(getAttackPoint() * .7);
				this.doubleAttackReady = false;
			}
		}else {
			System.out.println("Impossible to double attack");
		}
	}
	
	public boolean isDoubleAttackReady() {
		return doubleAttackReady;
	}

	private double getAttackPoint() {
		return this.force * 1.2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Warrior [doubleAttackReady=");
		builder.append(doubleAttackReady);
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
