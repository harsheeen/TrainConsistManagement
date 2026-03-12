package com.TrainManagement.UseCaseFour;
import java.util.*;

/**
 * 
 * USECASE 4 - TRAIN CONSIST MANAGEMENT
 * LINKED LIST IMPLEMENTATION
 * INITIALISE TRAIN AND USE FUNCTIONS SUCH AS addFirst, addLast, removeFirst, removeLast, contains
 * DISPLAY CONSIST SUMMARY
 * 
 * DESCRIPTION :
 * 
 * - MARKS THE ENTRY POINT OF THE TRAIN MANAGEMENT APPLICATION
 * - USES A LinkedList TO STORE BOGIES
 * - DISPLAYS THE INITIAL BOGIE COUNT
 * - USES FUNCTIONS SUCH AS addFirst, addLast, removeFirst, removeLast, contains
 * 
 * @author Harsheen
 * @version 4.0
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-4===================");
		
		//Initialising linkedlist
		List<String> trainConsist=new LinkedList<String>();

		System.out.println("Train initialised successfully using LinkedList");

		System.out.println("Initial Bogie Count:  "+trainConsist.size());
		
		//addFirst and addLast - Add the element to front and end of the linkedlist
		trainConsist.addFirst("B101");
		trainConsist.addLast("B103");
		trainConsist.addFirst("B104");
		trainConsist.add("B102");
		System.out.println("Current Train Consist:  "+trainConsist);

		
		trainConsist.remove("B102");
		System.out.println("Current Train Consist (remove(B102)): "+trainConsist);

		//removeLast - removes the last element from the list
		trainConsist.removeLast();
		System.out.println("Current Train Consist (removeLast): "+trainConsist);

		trainConsist.add(2,"B101");
		System.out.println("Current Train Consist (trainConsist.add(2,B101)) duplicate entry : "+trainConsist);
		

		boolean contains=true;

		contains=trainConsist.contains("B104");

		System.out.println("Is B104 present ? :  "+contains);

	}	
}
