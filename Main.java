package com.TrainManagement.UseCaseFifteen;

import java.util.LinkedList;

/**
* 
* USECASE 15 - TRAIN CONSIST MANAGEMENT
* SAFE CARGO ASSIGNMENT USING TRY-CATCH-FINALLY 
* 
* DESCRIPTION :
* 
* - DEFINES A CUSTOM RUNTIME EXCEPTION
* - VALIDATES CARGO ASSIGNMENT RULES
* - THROWS EXCEPTION FOR UNSAFE CARGO
* - EXECUTES FINALLY BLOCK FO LOGGING
* 
* @author Harsheen
* @version 15.0
*/
public class Main {
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-15=====================");

		LinkedList<Cargo> list=new LinkedList<>();
		
		//try-catch block that validate the assignment
		//constructor of BoogieCapacity checks if the petroleum is placed in cylindrical tank and throws exception if it is
		try {
		list.add(new Cargo("Grain","Rectangle"));
		System.out.println("Added "+list.getLast()+" successfully");
		list.add(new Cargo("Pulses","Rectangle"));
		System.out.println("Added "+list.getLast()+" successfully");
		list.add(new Cargo("Petroleum","Square"));
		System.out.println("Added "+list.getLast()+" successfully");
		list.add(new Cargo("Petroleum","Cylindrical"));
		System.out.println("Added "+list.getLast());

		}
		catch(CargoSafetyException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Execution Over");
		}
		
		}
}
