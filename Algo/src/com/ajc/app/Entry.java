package com.ajc.app;

import java.util.Scanner;

import com.ajc.app.model.City;
import com.ajc.app.model.Personne;

public class Entry {
		
	public static void main(String[] args) {
		
		City c2 = new City("Pau", "Fr", 2, false);
		City c1 = new City("Oloron", "Fr", .3, false);
		
		System.out.println(c1.makeCompare(c2));
		System.out.println(c1);

	}
}