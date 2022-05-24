package com.ajc.app.model.game;

import com.ajc.app.model.game.exception.GenevaConventionException;
import com.ajc.app.model.game.exception.NotEnoughManaException;

public class Wizard extends Humanoid{

	private int mana = 5;
	private int intelligence;
	private boolean shieldActivated;
	private int hitsOnShield;
	
	public Wizard(String name, double health, int force, int intelligence) {
		super(name, health, force);
		this.intelligence = intelligence;
	}	
	
	private double getAttackPoint() {
		return this.force * .8;
	}

	public void spellCast(Humanoid humanoid) throws NotEnoughManaException {
		if(this.mana >= 10) {
			humanoid.receiveDamage(getAttackPoint() + intelligence);
			this.mana -= 10;			
		}else {
			throw new NotEnoughManaException();
		}
	}
	
	@Override
	public void receiveDamage(double damage) {
		if(this.shieldActivated) {
			if(this.hitsOnShield < 5 ) {
				this.hitsOnShield++;				
			} else {
				this.hitsOnShield = 0;
				this.shieldActivated = false;				
			}
		}
		super.receiveDamage(shieldActivated ? damage * 0.8 : damage);
	}
	
	public void activateShield() throws NotEnoughManaException {
		if(this.mana >= 3) {
			this.shieldActivated = true;
			this.mana -= 3;
		}else {
			throw new NotEnoughManaException();
		}
	}

	@Override
	public void attack(Attackable attackable) throws GenevaConventionException {
		if(attackable instanceof Humanoid && ((Humanoid)attackable).getHealth() <= 0) {
			throw new GenevaConventionException();
		}
		attackable.receiveDamage(getAttackPoint());
		this.mana++;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public boolean isShieldActivated() {
		return shieldActivated;
	}

	public void setShieldActivated(boolean shieldActivated) {
		this.shieldActivated = shieldActivated;
	}

	public int getHitsOnShield() {
		return hitsOnShield;
	}

	public void setHitsOnShield(int hitsOnShield) {
		this.hitsOnShield = hitsOnShield;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wizard [mana=");
		builder.append(mana);
		builder.append(", intelligence=");
		builder.append(intelligence);
		builder.append(", shieldActivated=");
		builder.append(shieldActivated);
		builder.append(", hitsOnShield=");
		builder.append(hitsOnShield);
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
