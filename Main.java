package com.TrainManagement.UseCaseTwelve;

import java.util.*;
/**
 * 
 * USECASE 12 - TRAIN CONSIST MANAGEMENT
 * SAFETY COMPLIANCE CHECK FOR GOODS
 * 
 * DESCRIPTION :
 * - CREATES GOODS BOGIE LIST
 * - CONVERT LIST INTO STREAMS
 * - APPLIES SAFETY VALIDATION RULE
 * - DISPLAY SAFETY STATUS
 * 
 * @author Harsheen
 * @version 12.0
 */
public class Main {
	public static void main(String args[]) {

		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-12=====================");
		
		
		//Initialize the trainConsist as an ArrayList
		List<GoodsBoogie> trainConsist=new ArrayList<>();

		//Add objects of GoodsBoogie into the list
		trainConsist.add(new GoodsBoogie("Box","Grain"));
		trainConsist.add(new GoodsBoogie("Cylindrical","Petroleum"));
		trainConsist.add(new GoodsBoogie("Cylindrical","Coal"));
		trainConsist.add(new GoodsBoogie("Open","Grain"));

		//.allMatch() is used to check whether all elements in a stream satisfy a given condition (predicate).
		boolean fine=trainConsist.stream().allMatch(b->!b.getType().equals("Cylindrical")||b.getCargo().equals("Petroleum"));
		System.out.println("Safety Compilance Status: " + fine);

		System.out.print(fine ? "Safe" : "Not Safe");
	}
}