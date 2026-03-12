package com.TrainManagement.UseCaseThirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Boogie.Boogie;
/**
 * 
 * USECASE 13 - TRAIN CONSIST MANAGEMENT
 * PERFORMANCE COMPARISON (LOOPS VS STREAMS)
 *  
 * DESCRIPTION :
 * 
 * - CREATES BOGIE TEST DATASET 
 * - EXECUTE AND MEASURE TIME DIFFERENCE BETWEEN LOGICAL GROUPING AND STREAM GROUPIN
 * - DISPLAY THE PERFORMANCE RESULTS
 * 
 * @author Harsheen
 * @version 13.0
 */
public class Main {
	public static void main(String argss[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-13=====================");
		
		//Initialize the trainConsist and add objects of Boogie 
		List<Boogie> trainConsist=new ArrayList<>();

		trainConsist.add(new Boogie("AC", 25));
		trainConsist.add(new Boogie("Sleeper", 21));
		trainConsist.add(new Boogie("Second AC", 28));
		trainConsist.add(new Boogie("AC", 13));
		
		//Print the elements of Boogie
		for(Boogie boogie: trainConsist) {
			System.out.println("name: "+boogie.getName());
			System.out.println("capacity: "+boogie.getCapacity());
			System.out.println();
		}

		System.out.println("=====Grouped Boogies Using Streams======");
		
		//Execute and calculate time of execution taken by streams
		double start=System.nanoTime();
		Map<String, List<Boogie>> groupedoogies=trainConsist.stream().collect(Collectors.groupingBy( b -> b.getName()));
		double end= System.nanoTime();
		System.out.println(groupedoogies);
		System.out.print("Execution time using Streams: ");
		System.out.println((end-start)/1000);
		
		System.out.println();
		
		//Execute and calculate time of execution taken by logical grouping
		System.out.println("=====Grouped Boogies Using Logical Thinking======");

		//using logical grouping by Hash map
		start=System.nanoTime();
		HashMap<String,Integer> hashmap = new HashMap<>();
		for(int i = 0; i < trainConsist.size(); i++) {

			String name = trainConsist.get(i).getName();
			int capacity = trainConsist.get(i).getCapacity();

			if(hashmap.containsKey(name)) {
				hashmap.put(name, hashmap.get(name) + capacity);
			}
			else {
				hashmap.put(name, capacity);
			}
		}

		System.out.println(hashmap);
		
		end=System.nanoTime();
		
		//print execution time using logical grouping by hashmap
		System.out.print("Execution time using logical thinking: ");
		System.out.println((end-start)/1000);
		
	}
}

;