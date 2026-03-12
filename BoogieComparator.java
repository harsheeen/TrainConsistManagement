package com.TrainManagement.UseCaseSeven;
import Boogie.Boogie;
import java.util.Comparator;



public class BoogieComparator implements Comparator<Boogie>{
	@Override
	public int compare(Boogie b1, Boogie b2) {
		return b1.capacity-b2.capacity;
	}
}
