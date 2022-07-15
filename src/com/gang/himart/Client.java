package com.gang.himart;

import com.gang.himart.Cellphone;
import com.gang.himart.Client;
import com.gang.himart.Computer;
import com.gang.himart.HimartUnit;
import java.util.Scanner;

public class Client {
	
	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
	public void buy(Television tv)  {
		
			this.money = this.money - tv.getPrice();
			this.point = this.point  + tv.getPoint();
			
			System.out.println("잔액 : " + this.money);
			System.out.println("point : " + this.point);
		
	}
	public void buy(Computer com)  {
		
		this.money = this.money - com.getPrice();
		this.point = this.point  + com.getPoint();
		
		System.out.println("잔액 : " + this.money);
		System.out.println("point : " + this.point);
	
	}
	public void buy(Cellphone phone)  {
	
	this.money = this.money - phone.getPrice();
	this.point = this.point  + phone.getPoint();
	
	System.out.println("잔액 : " + this.money);
	System.out.println("point : " + this.point);

	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
