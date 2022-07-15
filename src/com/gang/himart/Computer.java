package com.gang.himart;

public class Computer extends HimartUnit {
	private String cpu;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public Computer() {
		// TODO Auto-generated constructor stub
		this.cpu = "M2";
		this.setBrand("MacMini");
		this.setPrice(2000000);
		this.setPoint(100);
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("CPU : " + this.cpu);
		System.out.println();
		
	}

}
