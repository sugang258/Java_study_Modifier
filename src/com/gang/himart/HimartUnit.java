package com.gang.himart;

public abstract class HimartUnit {
	private String brand;
	private int price;
	private int point;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//public abstract void info();
	public void info() {
		System.out.println("Brand : " + this.getBrand());
		System.out.println("Price : " + this.getPrice());
		System.out.println("Point : " +this.getPoint());
	}
	
	
	

}
