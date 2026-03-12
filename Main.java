
package com.TrainManagement.UseCaseTwenty;

import java.util.Arrays;

import com.TrainManagement.UseCaseTwenty.EmptySearchException;
/**
 * 
 * USECASE 20 - TRAIN CONSIST MANAGEMENT
 * Exception Handling During Search Operations
 * 
 * DESCRIPTION :
 * 
 * - CREATE BOGGIE COLLECTION
 * - VALIDATE SYSTEM STATE
 * - THROWS EXCEPTION IF EMPTY
 * - STOPS INVALID SEARCH OPERATION
 * DISPLAYS MEANINGFUL MESSAGE
 * 
 * @author Harsheen
 * @version 20.0
 */
public class Main {
	
	public static void main(String args[]) throws EmptySearchException {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-18=====================");
		
		//Initialize an empty array of strings
		String[] boogie_id= {};
		String Search_id="B103";

		//try-catch block that throws exception when the array is empty
		try {
			if(boogie_id.length==0) {
				throw new EmptySearchException("Exception is thrown: Boogie is empty");
			}
		}
		catch(EmptySearchException e) {
			System.out.println(e.getMessage());
		}
		
		//If the array is not empty, print and find the Search_id element in the array
		Arrays.stream(boogie_id).forEach(x -> System.out.print(x + " "));
		System.out.println();
		boolean find=false;

		for(String boogie:boogie_id) {
			if(boogie.equals(Search_id)) {
				find=true;
				break;
			}
		}



	}
}

