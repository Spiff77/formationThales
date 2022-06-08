package com.thales.formation.model.student.utils;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Getter;

@Getter
public class ConnectionManager {

	private static ConnectionManager INSTANCE;
	private EntityManagerFactory emf;
	
	private ConnectionManager() {
		emf = Persistence.createEntityManagerFactory("car");
	}
	
	public static ConnectionManager getInstance() {
		if(INSTANCE == null) {
			INSTANCE =  new ConnectionManager();
		}
		return INSTANCE;
	}
	
	public void close() {
		if(emf != null && emf.isOpen()) {
			emf.close();
		}
		INSTANCE = null;
	}

}
