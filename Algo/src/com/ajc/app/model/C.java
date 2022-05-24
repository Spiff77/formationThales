package com.ajc.app.model;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.ajc.app.model.exception.BadValueException;

public class C {

	
	public void hello() {
		Random r = new Random();
		int v = r.nextInt(10);
		if( v % 2==0) {
			if(v != 6) {
				//throw new BadValueException("qdssqfd");
			}
			//throw new RuntimeException("Not implemented");
		}else {
			//throw new InputMismatchException("Bad number");			
		}
	}
	
	public int test() {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		
		try {
			int val = sc.nextInt();	
			if(val == 5) {
				return 10;
			}
		}catch (Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Bye");			
		}
		return v;
	}

}
