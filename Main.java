package com.TrainManagement.UseCaseEleven;
import java.util.*;
import java.util.regex.*;
/**
 * 
 * USECASE 11 - TRAIN CONSIST MANAGEMENT
 * VALLIDATE TRAIN ID AND CARGO CODE
 * 
 * DESCRIPTION :
 * 
 * - ACCEPT TRAIN ID AS INPUT
 * - APPLY REGEX, CONTINUE AFTER THE USER FOLLOWS THE CORRECT PATTERN OF TRAIN ID
 * - ACCEPT CARGO ID AS INPUT
 * - APPLY REGEX, CONTINUE AFTER THE USER FOLLOWS THE CORRECT PATTERN OF CARGO ID
 * 
 * @author Harsheen
 * @version 11.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("============================================");
		System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
		System.out.println("==================UC-11=====================");

		
		String TrainID = "";
		Scanner sc=new Scanner(System.in);
		
		//loop continues until user enters correct pattern of TrainID
		while(true) {
			System.out.print("enter the TrainID (TRN-XXXX)");
			TrainID = sc.nextLine();
			
			//regex pattern for train id - TRN-1234
			Pattern pattern = Pattern.compile("^TRN-[0-9]{4}$");
			Matcher matcher = pattern.matcher(TrainID);

			//.matches() return true if the matcher matches with the compiled pattern
			if(matcher.matches()) {
				System.out.println("Valid TrainID");
				break;
			} else {
				System.out.println("Invalid TrainID");
			}
		}
		String CargoID;
		//loop continues until user enters correct pattern of CargoID
		while(true) {
			System.out.print("enter the CargoCode (PET-XX)");
			CargoID= sc.nextLine();
			
			//regex pattern for train id - PET-23
			Pattern pattern = Pattern.compile("^PET-[A-Z]{2}$");
			Matcher matcher = pattern.matcher(CargoID);
			
			//.matches() return true if the matcher matches with the compiled pattern
			if(matcher.matches()) {
				System.out.println("Valid CargoID");
				break;
			} else {
				System.out.println("Invalid CargoID");
			}
		}
		sc.close();
		
	}
}

