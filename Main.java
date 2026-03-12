package com.TrainManagement.UseCaseSeven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Boogie.Boogie;
/**
 * 
 * USECASE 7 - TRAIN CONSIST MANAGEMENT
 * SORT BOGIES BY CAPACITY
 * 
 * DESCRIPTION :
 * 
 * - MARKS THE ENTRY POINT OF THE TRAIN MANAGEMENT APPLICATION
 * - USES A DYNAMIC LIST TO STORE BOGIES
 * - DISPLAYS THE INITIAL BOGIE COUNT
 * 
 * @author Harsheen
 * @version 7.0
 */
public class Main {
	
	
public static void main(String args[]) {
	System.out.println("============================================");
	System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
	System.out.println("====================UC-7===================");
	
	//Initialize ArrayList to store the object of Boogie
	List<Boogie> trainConsist=new ArrayList<>();
	
	trainConsist.add(new Boogie("AC", 25));
	trainConsist.add(new Boogie("Sleeper", 21));
	trainConsist.add(new Boogie("Second AC", 28));
	trainConsist.add(new Boogie("Third AC", 13));

	System.out.println("Normal trainConsist");
	System.out.print(trainConsist);
	System.out.println();
	
	//Calling comparator to sort using BoogieComparator
	System.out.println("sorted trainConsist by capacity");
	Collections.sort(trainConsist, new BoogieComparator());
	System.out.println();

	System.out.print(trainConsist);
}
}

