package com.ajc.app.model.game;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Map {

	List<Warrior> warriors = new ArrayList<Warrior>();
	
	private static Map INSTANCE;
	
	private Map() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Map();
		}
		return INSTANCE;
	}
	
	public void add(Warrior w) {
		this.warriors.add(w);
	}
	

}
