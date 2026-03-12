package com.TrainManagement.UseCaseNineteen;

import java.util.Arrays;
/**
 * 
 * USECASE 19 - TRAIN CONSIST MANAGEMENT
 * Binary Search for Bogie ID (Optimized Searching)
 * 
 * DESCRIPTION :
 * - CREATES SORTED BOGGIE ID ARRAY
 * - DEFINES SEARCH KEY
 * - APPLIES BINARY SEARCH LOGIC
 * - NARROWS THE SEARCH RANGE ITERATION
 * 
 * @author Harsheen
 * @version 19.0
 */
public class Main {
	//
	public static void print(String arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(" [ " + arr[i]+" ] ");
		System.out.println();
	}
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("====================UC-19===================");
		
		
		//Initialize the array of strings
		String[] Boogie_names= {"Sleeper", "AC Chair", "Luxury", "General","First Class"};
		String Search_id="Sleeper";
		
		//Print the array before sorting
		System.out.println("Before Sorting");
		print(Boogie_names);
		System.out.println();
		
		//Sort the array
		Arrays.sort(Boogie_names);
		System.out.println("After Sorting");
		print(Boogie_names);
		
		
		boolean find=false;
		int low=0,mid;
		int high=Boogie_names.length-1;
		
		//Apply Binary Search logic on the sorted array
		while(low<=high) {
			mid = low + (high - low) / 2;
			if(Boogie_names[mid].equals(Search_id)) {  
				find=true;
				break;
			}
			else if(Boogie_names[mid].compareTo(Search_id)<0) {  //if the element comes after the mid element, shift low to mid+1
				low=mid+1;
			}
			else {
				high=mid-1;   //if the element comes before the mid element, shift high to mid-1
			}

		}
		System.out.println();
		System.out.print("Can you find "+Search_id+" : ");
		System.out.println((find)?"Found":"Not Found");



	}
}

