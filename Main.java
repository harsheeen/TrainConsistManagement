package com.TrainManagement.UseCaseFourteen;

import java.util.*;
/**
 * 
 * USECASE 14 - TRAIN CONSIST MANAGEMENT
 * HANDLE INVALID BOGIE CAPACITY (CUSTOM EXCEPTION)
 * 
 * DESCRIPTION :
 * 
 * - DEFINES A CUSTOM EXCEPTION
 * - VALIDATES CAPACITY INSIDE A CONSTRUCTOR
 * - THROWS EXCEPTION IS CAPACITY<0
 * - CONTINUES EXECUTION SAFELY
 * 
 * @author Harsheen
 * @version 14.0
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-14=====================");

	LinkedList<BoogieCapacity> list=new LinkedList<>();
	
	//try-catch block that validate the capacity
	//constructor of BoogieCapacity checks if the capacity>0 and throws exception if it is
	try {
	list.add(new BoogieCapacity("AC",10));
	System.out.println("Added "+list.getLast());
	list.add(new BoogieCapacity("Sleeper",20));
	System.out.println("Added "+list.getLast());
	list.add(new BoogieCapacity("Second AC",13));
	System.out.println("Added "+list.getLast());
	list.add(new BoogieCapacity("Third AC",0));
	System.out.println("Added "+list.getLast());

	}
	catch(InvalidCapacityException e) {
		System.out.println(e.getMessage());
		
	}
	finally {
		System.out.println("Execution Over");
	}
	
	}
}


