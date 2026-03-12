package com.TrainManagement.UseCaseFifteen;

public class Cargo {
	String type, cargo;
	public Cargo(String type, String cargo) {
		this.type=type;
		this.cargo=cargo;
		assignCargo();
	}
	
	void assignCargo() {
		if(type.equals("Petroleum")) {
			if(cargo.equals("Cylindrical")) {
				throw new CargoSafetyException("Cargo assignment not safe");
			}
				
		}
	}
	public String toString() {
	    return type + " " + cargo;
	}
}
