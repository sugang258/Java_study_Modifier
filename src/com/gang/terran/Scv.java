package com.gang.terran;

import com.gang.unit.Unit;

public class Scv extends Unit {
	   
	  
	   public Scv(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	public void attack() {
	      System.out.println("공격  치직" );
	   }
	   public void work() {
	      System.out.println("미네랄 치직" );
	   }
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	   

}
