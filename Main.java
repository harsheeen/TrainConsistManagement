package com.TrainManagement.UseCaseTwo;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * USECASE 2 - TRAIN CONSIST MANAGEMENT
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
 * @version 2.0
 */
public class Main {
	public static void main(String args[]) {

		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-2===================");

		//initialize the arraylist
		List<String> trainConsist=new ArrayList<>();

		System.out.println("Train initialised successfully");
		//.size() returns the initial size - number of element sin arraylist
		System.out.println("Initial Bogie Count:  "+trainConsist.size());

		//add elements to the arraylist
		trainConsist.add("AC");
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		System.out.println("Current Train Consist:  "+trainConsist);

		//remove AC using function.remove(ele)
		trainConsist.remove("AC");
		System.out.println("Current Train Consist (trainConsist.remove(AC)): "+trainConsist);
		
		//remove index 0 using remove(index)
		trainConsist.remove(0);
		System.out.println("Current Train Consist (trainConsist.remove(0)):  "+trainConsist);

		//add(index,ele)
		trainConsist.add(1,"Second Class");
		System.out.println("Current Train Consist (trainConsist.add(1, Second Class): "+trainConsist);

		boolean contains=true;
		//contains return boolean value on the basis if element exist 
		contains=trainConsist.contains("AC Chair");

		System.out.println("Is AC present ? :  "+contains);

	}
}
