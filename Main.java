package com.TrainManagement.UseCaseNine;

import java.util.*;
import java.util.stream.Collectors;

import Boogie.Boogie;
/**
 * USECASE 9 - TRAIN CONSIST MANAGEMENT
 * GROUP BOGIES BY CAPACITY
 * JAVA 9STREAM Collectors.groupingBy()
 * 
 * DESCRIPTION :
 * 
 * - CREATES A LIST OF BOGIES
 * - STREAM THE LIST
 * - GROUP BOGIES BY NAME
 * - STORE THE GROUPED DATA IN MAP
 * 
 * @author Harsheen
 * @version 9.0
 */
public class Main {

	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-9===================");
		
		//Initialize the ArrayList that stores Boogie object
		List<Boogie> trainConsist=new ArrayList<>();

		trainConsist.add(new Boogie("AC", 25));
		trainConsist.add(new Boogie("Sleeper", 21));
		trainConsist.add(new Boogie("Second AC", 28));
		trainConsist.add(new Boogie("AC", 13));

		for(Boogie boogie: trainConsist) {
			System.out.println("name: "+boogie.getName());
			System.out.println("capacity: "+boogie.getCapacity());
			System.out.println();
		}
		
		System.out.println("=====Grouped Boogies======");
		
		//groupingBy() is a collector used to group elements of a stream based on a key.
		Map<String, List<Boogie>> groupedoogies=trainConsist.stream().collect(Collectors.groupingBy( b -> b.getName()));
	
		//Convert the grouped stream into map and print the key-value pairs
		for(Map.Entry<String,List<Boogie>> entry : groupedoogies.entrySet()) {

		    System.out.println("Boogie Type: " + entry.getKey());

		    for(Boogie b : entry.getValue()) {
		        System.out.println("Capacity: " + b.getCapacity());
		    }

		    System.out.println();
		}

	}
}