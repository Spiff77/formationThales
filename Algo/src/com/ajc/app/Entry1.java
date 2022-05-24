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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Entry1 {
	
	static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		//serializeJson();
		deSerializeJson();
	}
	
	
	public static void deSerializeJson() {
		
		Gson gson = new GsonBuilder().create();
		Path path = new File("test.json").toPath();
		
		try(Reader reader = Files.newBufferedReader(path)){
			
			List<Dog> dogs =Arrays.asList(gson.fromJson(reader, Dog[].class));
			for (Dog dog : dogs) {
				System.out.println(dog);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void serializeJson() {
		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
		Gson gson = builder.create();
		try(FileOutputStream fw = new FileOutputStream("test.json");
			OutputStreamWriter out = new OutputStreamWriter(fw)	
				){
			ArrayList<Dog> dogs = new ArrayList<Dog>();
			dogs.add(new Dog("Test", "test"));
			dogs.add(new Dog("Test1", "test1"));
			gson.toJson(dogs, out);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void deSerialize() {
		File f = new File("test.xml");
		try(
			FileInputStream fsi = new FileInputStream(f);
			XMLDecoder ois = new XMLDecoder(fsi);){
		
			ArrayList<Dog> dogs =  (ArrayList<Dog>) ois.readObject();

			System.out.println(dogs);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
	public static void serialize() {

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Test", "test"));
		dogs.add(new Dog("Test1", "test1"));


		try(FileOutputStream fos = new FileOutputStream("test.xml");
			XMLEncoder out = new XMLEncoder(fos);) {

			out.writeObject(dogs);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
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

