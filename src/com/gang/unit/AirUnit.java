package com.gang.unit;

public abstract class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	private int wings;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	

}
