package com.TrainManagement.UseCaseSix;

import java.util.*;
/**
 * 
 * USECASE 6 - TRAIN CONSIST MANAGEMENT
 * INITIALISE TRAIN AND DISPLAY CONSIST SUMMARY USING MAP INTERFACE
 * 
 * DESCRIPTION :
 * 
 * - MARKS THE ENTRY POINT OF THE TRAIN MANAGEMENT APPLICATION
 * - USES A DYNAMIC LIST TO STORE BOGIES
 * - DISPLAYS THE INITIAL BOGIE COUNT
 * 
 * @author Harsheen
 * @version 6.0
 */
public class Main {
public static void main(String args[]) {
	System.out.println("============================================");
	System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
	System.out.println("====================UC-6===================");
	
	//Initialse HashMap to store name and capacity of the boogie 
	Map<String,Integer> map=new HashMap<String, Integer>();
	
	map.put("B101",100);
	map.put("B102",27);
	map.put("B103",66);
	map.put("B104",45);
	
	//entrySet -> returns a set of key–value pairs from the map
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
}
}
