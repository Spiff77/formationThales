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

import com.ajc.app.model.Dog;
import com.ajc.app.parking.model.Parking;
import com.ajc.app.parking.model.Parking.TollGate;
import com.ajc.app.parking.model.RegisteredCar;
import com.ajc.app.parking.model.TollGatePayable;
import com.ajc.app.parking.model.Truck;
import com.ajc.app.resto.model.Commande;
import com.ajc.app.resto.model.Eboisson;
import com.ajc.app.resto.model.Edessert;
import com.ajc.app.resto.model.Eplat;
import com.ajc.app.resto.model.Commande.Ticket;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Entry1 {
	
	public static void main(String[] args) {

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

