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
	
	public void buy(HimartUnit himartunit)  {
		
			this.money = this.money - himartunit.getPrice();
			this.point = this.point  + himartunit.getPoint();
			
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
