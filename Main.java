package com.TrainManagement.UseCaseOne;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * USECASE 1 - TRAIN CONSIST MANAGEMENT
 * INITIALISE TRAIN AND DISPLAY CONSIST SUMMARY
 * 
 * DESCRIPTION :
 * 
 * - MARKS THE ENTRY POINT OF THE TRAIN MANAGEMENT APPLICATION
 * - USES A DYNAMIC LIST TO STORE BOGIES
 * - DISPLAYS THE INITIAL BOGIE COUNT
 * 
 * @author Harsheen
 * @version 1.0
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-1===================");
		//initialize the arraylist
		List<String> trainConsist=new ArrayList<>();
		
		System.out.println("Train initialised successfully");
		//.size() returns the initial size - number of element sin arraylist
		System.out.println("Initial Bogie Count:  "+trainConsist.size());
		//printing the empty arraylist
		System.out.println("Current Train Consist:  "+trainConsist);
		
		System.out.println("System ready for operations....");

		
	}
}
