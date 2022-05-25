package com.ajc.app;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.lang.reflect.Modifier;

import com.ajc.app.model.Adresse;
import com.ajc.app.model.Dog;
import com.ajc.app.model.Personne;
import com.ajc.app.model.PersonneBuilder;
import com.ajc.app.model.bank.BankCard;
import com.ajc.app.model.bank.BankCardAdapter;
import com.ajc.app.model.bank.CardReader;
import com.ajc.app.model.bank.RegisteredUserCard;
import com.ajc.app.model.cars.Vehicule;
import com.ajc.app.model.game.Action;
import com.ajc.app.model.game.Map;
import com.ajc.app.model.game.Player;
import com.ajc.app.parking.model.Parking;
import com.ajc.app.parking.model.Parking.TollGate;
import com.ajc.app.parking.model.adapter.CD;
import com.ajc.app.parking.model.adapter.CDAdapter;
import com.ajc.app.parking.model.adapter.K7;
import com.ajc.app.parking.model.adapter.RadioK7;
import com.ajc.app.parking.model.factory.VehiculeFactory;
import com.ajc.app.parking.model.factory.VehiculeType;
import com.ajc.app.parking.model.observer.CitySign;
import com.ajc.app.parking.model.RegisteredCar;
import com.ajc.app.parking.model.TollGatePayable;
import com.ajc.app.parking.model.Truck;
import com.ajc.app.parking.model.Vehicle;
import com.ajc.app.resto.model.Commande;
import com.ajc.app.resto.model.Eboisson;
import com.ajc.app.resto.model.Edessert;
import com.ajc.app.resto.model.Eplat;
import com.ajc.app.resto.model.Commande.Ticket;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Entry1 {
	
	public static void main(String[] args) {
		Parking p = new Parking<Vehicle>("CDG", "JeanClaude");
		
		CitySign c1 = new CitySign();
		CitySign c2 = new CitySign();
		
		p.attach(c1);
		p.attach(c2);
		
		p.notifAll();
		p.park(new RegisteredCar("sffs", "sfdfs"));
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

