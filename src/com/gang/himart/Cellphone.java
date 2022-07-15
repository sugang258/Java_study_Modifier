package com.gang.himart;

public class Cellphone extends HimartUnit {
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

	public Cellphone() {
		// TODO Auto-generated constructor stub
		this.company = "수경컴퍼니";
		this.setBrand("아이폰23");
		this.setPrice(1500000);
		this.setPoint(8);
		
	}
	public void info() {
		super.info();
		System.out.println("Company : " + this.company);
		System.out.println();
	}

}
