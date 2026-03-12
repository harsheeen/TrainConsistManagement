package com.TrainManagement.UseCaseThree;
import java.util.*;

/**
 * 
 * USECASE 3 - TRAIN CONSIST MANAGEMENT
 * INITIALISE TRAIN AND USE FUNCTIONS SUCH AS add, remove, contains
 * DISPLAY CONSIST SUMMARY
 * 
 * DESCRIPTION :
 * 
 * - MARKS THE ENTRY POINT OF THE TRAIN MANAGEMENT APPLICATION
 * - USES A DYNAMIC LIST TO STORE BOGIES
 * - DISPLAYS THE INITIAL BOGIE COUNT
 * - USES FUNCTIONS SUCH AS ADD, REMOVE, CONTAINS
 * 
 * @author Harsheen
 * @version 3.0
 */
public class Main {
	public static void main(String args[]) {

		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-3===================");

		Set<String> trainConsist=new HashSet<String>();

		System.out.println("Train initialised successfully");
		//.size() returns the initial size - number of element sin arraylist
		System.out.println("Initial Bogie Count:  "+trainConsist.size());
		
		//add(ele) to the set
		trainConsist.add("B101");
		trainConsist.add("B102");
		trainConsist.add("B103");
		trainConsist.add("B104");
		System.out.println("Current Train Consist:  "+trainConsist);

		//remove(ele) from the set
		trainConsist.remove("B102");
		System.out.println("Current Train Consist (trainConsist.remove(B102)): "+trainConsist);

		trainConsist.add("B101");
		System.out.println("Current Train Consist after adding duplicates (trainConsist.add(B101)): "+trainConsist);


		boolean contains=true;

		contains=trainConsist.contains("B104");

		System.out.println("Is B104 present ? :  "+contains);

	}	

}
