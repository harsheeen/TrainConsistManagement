package Boogie;

public class Boogie{
	
	//name and capacity of the boggie
	public String name;
	public int capacity;
	
	public Boogie(String name, int capacity){
		this.name=name;
		this.capacity=capacity;
		
	}
	
	//user defined toString()
	public String toString() {
		return name+"  "+capacity+"\n";
		
	}
	//public getters for capacity and name
	public int getCapacity() {
		// TODO Auto-generated method stub
		return this.capacity;
	}

	public String getName() {
		return name;
	}

	
}
