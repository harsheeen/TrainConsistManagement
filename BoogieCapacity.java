package com.TrainManagement.UseCaseFourteen;

public class BoogieCapacity {
	public String name;
	public int capacity;
	public BoogieCapacity(String name, int capacity) throws InvalidCapacityException {
		this.name=name;
		if(capacity<1) {
			throw new InvalidCapacityException("Capacity less than 1 not allowed");
		}
		this.capacity=capacity;
	}
	public String toString() {
	    return name + " " + capacity;
	}
}


