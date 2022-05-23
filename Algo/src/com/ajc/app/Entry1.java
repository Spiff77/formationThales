package com.ajc.app;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.ajc.app.model.A;
import com.ajc.app.model.Animal;
import com.ajc.app.model.Antilope;
import com.ajc.app.model.C;
import com.ajc.app.model.Cat;
import com.ajc.app.model.Dog;
import com.ajc.app.model.bank.Client;
import com.ajc.app.model.bank.Compte;
import com.ajc.app.model.bank.CompteEpargne;
import com.ajc.app.model.bank.CompteSimple;
import com.ajc.app.model.cars.Boat;
import com.ajc.app.model.Car;
import com.ajc.app.model.CarComparator;
import com.ajc.app.model.CarInfo;
import com.ajc.app.model.cars.Owner;
import com.ajc.app.model.cars.Plane;
import com.ajc.app.model.cars.Vehicule;
import com.ajc.app.model.game.Berseker;
import com.ajc.app.model.game.Humanoid;
import com.ajc.app.model.game.Rock;
import com.ajc.app.model.game.Warrior;
import com.ajc.app.model.game.Wizard;
import com.ajc.model.cars.Bateau;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
				
		sc.nextInt();
		
		
		Warrior w1 = new Warrior("toto",200, 10);
		Warrior w2 = new Warrior("tutu",100, 10);
		Warrior w3 = new Warrior("titi",150, 10);
		
		List<Humanoid> list = new ArrayList<Humanoid>();
		
		list.add(w1);
		list.add(w2);
		list.add(w3);
		
		Collections.sort(list);
		
		for (Humanoid humanoid : list) {
			System.out.println(humanoid);
		}
		
		List<Car> list2 = new ArrayList<Car>();
		
		list2.add(new Car(0, new CarInfo("", "")));
		list2.add(new Car(100, new CarInfo("", "")));
		list2.add(new Car(50, new CarInfo("", "")));
		
		list2.sort(Comparator.comparingInt(Car::getSpeed));
		
		for (Car car : list2) {
			System.out.println(car);
			
		}
	}
		

}

/**
 * On veut une equipe d'Orcs associé à un chef (Orc également)
 * 
 * Chef equipe 1: Jean
 *  - Jacques (50hp)
 *  - Paule (40hp)
 * Chef equipe 2: Pierre
 *  - Michel (50hp)
 *  - JC (40hp)
 */

