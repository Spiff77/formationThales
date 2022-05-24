package com.ajc.app.model;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public abstract class AnimalCarnivor extends Animal implements Serializable{
	int quantiteViande;

	public AnimalCarnivor(String name) {
		super(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalCarnivor [quantiteViande=");
		builder.append(quantiteViande);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
