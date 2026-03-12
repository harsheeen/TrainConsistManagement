package com.TrainManagement.UseCaseSeventeen;
/**
 * 
 * USECASE 17 - TRAIN CONSIST MANAGEMENT
 * Sort Bogie Names Using Arrays.sort()
 * 
 * DESCRIPTION :
 * 
 * - CREATES AN ARRAY OF BOGGIE NAMES
 * - USES ARRAY.SORT() FOR SORTING
 * - DISPLAYS THE SORTED RESULTS
 * 
 * @author Harsheen
 * @version 17.0
 */
import java.util.Arrays;

public class Main {
	//Helper function-to print the elements of array
	public static void print(String arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(" [ " + arr[i]+" ] ");
		System.out.println();
	}
	
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-17=====================");
		
		//Initialize the Array
		String[] Boogie_names= {"Sleeper", "AC Chair", "Luxury", "General","First Class"};
		System.out.println("Before Sorting");
		
		//printing the elements in their insertion order
		print(Boogie_names);
		System.out.println();
		
		//Arrays.sort()- sort the array of strings in lexicographically order
		Arrays.sort(Boogie_names);
		System.out.println("After Sorting");
		print(Boogie_names);
	}
	}
