package com.TrainManagement.UseCaseEighteen;

import java.util.Arrays;
/**
 * 
 * USECASE 18 - TRAIN CONSIST MANAGEMENT
 * Linear Search for Bogie ID (Array-Based Searching)
 * 
 * DESCRIPTION :
 * 
 * - CREATES AN ARRAY OF BOGGIE IDs
 * - ACEPTS A SEARCH KEY
 * - TRAVERSETHE ARRAY SEQUENTIALLY
 * - STOPS WHEN ARRAY IS FOUND
 * - DISPLAYS THE SEARCH RESULT
 * 
 * @author Harsheen
 * @version 18.0
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-20=====================");

		//Initialize an array of Strings
		String[] boogie_id= {"B101","B102","B103","B104"};
		
		//Search_id defines the train to be searched
		String Search_id="B103";
		System.out.println("Present Boogie IDs are");
		
		
		Arrays.stream(boogie_id).forEach(x -> System.out.print(x + " "));
		System.out.println();
		boolean find=false;
		
		//for-each loop to find the Search_id element 
		for(String boogie:boogie_id) {
			if(boogie.equals(Search_id)) {
				find=true;
				break;
			}
		}
		System.out.print("Is " +Search_id+" Present?");
		System.out.print(find ? " Yes " : "No");


	}

}