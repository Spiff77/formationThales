package com.ajc.app;

import java.util.Scanner;

import com.ajc.app.model.Computer;

public class Entry2 {
	
	public static void main(String[] args) {
		Computer computers[] = new Computer[3]; 
			
		computers[0] = new Computer("PB");
		computers[1] = new Computer();
		computers[2] = new Computer("HP", 2);
		
		for (Computer computer : computers) {
			System.out.println(computer);
		}
	}
	

	
}