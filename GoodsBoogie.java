package com.TrainManagement.UseCaseTwelve;

public class GoodsBoogie {
	String type;
	String cargo;
	public GoodsBoogie(String string, String cargo) {
		this.type=string;
		this.cargo=cargo;
	}
	public String getType() {
		return type;
	}
	public String getCargo() {
		return cargo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
