package com.thales.formation;

import java.sql.SQLException;
import java.text.ParseException;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class Entry {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
		
		
		emf.close();
	}
	
}
