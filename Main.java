package com.TrainManagement.UseCaseSixteen;
/**
 * 
 * USECASE 16 - TRAIN CONSIST MANAGEMENT
 * Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
 * 
 * DESCRIPTION :
 * - CREATES AN ARRAY OF CAPACITY
 * - COMPARES ADJACENT VALUES
 * - SWAPS VALUES WHEN REQUIRED
 * - REPEATS UNTIL SORTED
 * - DISPLAY SORTED RESULT
 * 
 * @author Harsheen
 * @version 16.0
 */
public class Main {
	//Helper function-to print the elements of array
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-16=====================");

		//initialize the array
		int[] capacity= {10,23,11,9,8,43};
		System.out.println("Original Array");
		print(capacity);
		
		//Bubble sort logic
		//outer loop
		for(int i=0;i<capacity.length;i++) {
			//inner loop
			for(int j=0;j<capacity.length-i-1;j++) {

				if(capacity[j]>capacity[j+1]) {
					int temp=capacity[j];
					capacity[j]=capacity[j+1];
					capacity[j+1]=temp;
				}
			}

		}
		System.out.println("Array after applying bubble sort");
		print(capacity);
	}
}
