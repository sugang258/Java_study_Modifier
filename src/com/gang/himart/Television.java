package com.gang.himart;

public class Television extends HimartUnit {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Television() {
		// TODO Auto-generated constructor stub
		this.size = 100;
		this.setBrand("LG QLED TV");
		this.setPrice(7999999);
		this.setPoint(200);
		
	}
	
	public void info() {
		super.info();
		System.out.println("Size : " + this.size); 
		System.out.println();
	}

}
