package com.TrainManagement.UseCaseEight;

import java.util.*;
import com.TrainManagement.UseCaseSeven.BoogieComparator;
import Boogie.Boogie;
/**
 * 
 * USECASE 8 - FILTER PASSNGER USING STREAMS
 * 
 * DESCRIPTION :
 * 
 * - CREATES A LIST OF BOOGIES
 * - CONVERTS LIST INTO STREAMS
 * - APPLY FILTER CONDITION
 * - COLLECTS FILTERED RESULT
 * 
 * @author Harsheen
 * @version 8.0
 */
public class Main {

public static void main(String args[]) {
	System.out.println("============================================");
	System.out.println("======TRAIN CONSIST MANAGEMENT SYSTEM ======");
	System.out.println("====================UC-8===================");
	
	//Initialize ArrayLList to store Boogie objects
	List<Boogie> trainConsist=new ArrayList<>();
	
	//Add new Boogie objects to the trainConsist
	trainConsist.add(new Boogie("AC", 25));
	trainConsist.add(new Boogie("Sleeper", 21));
	trainConsist.add(new Boogie("Second AC", 28));
	trainConsist.add(new Boogie("Third AC", 13));

	
	System.out.println("Normal trainConsist");
	System.out.print(trainConsist);
	System.out.println();
	System.out.println();

	//Sort the trainConsist using comparator that sorts basedon capacity
	Collections.sort(trainConsist, new BoogieComparator());
	System.out.println("sorted trainConsist by capacity");
	System.out.print(trainConsist);
	System.out.println();
	System.out.println();

	//Filter the Boogie based on capacity using streams
	//filter() is used to select elements that satisfy a condition from a stream.
	List<Boogie> stream_trainConsist=trainConsist.stream()
            .filter(b -> b.getCapacity() > 20)
            .toList();
	System.out.println("trainConsist by capacity > 20");
	System.out.print(stream_trainConsist);

}
}
