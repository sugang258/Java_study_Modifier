package com.gang.terran;

import com.gang.unit.Unit;

public class Marine extends Unit {

	   private String weapon;
	   
	   
	   public String getWeapon() {
	      return weapon;
	   }
	   public void setWeapon(String weapon) {
	      this.weapon = weapon;
	   }
	   
	  
		   
	   public void shoot() {
		   System.out.println("우당탕탕탕" );
	   }
		   
	   //오버라이딩
		@Override
		public void move() {
			System.out.println("뛰어다님!!");
		}
		
		//오버라이딩
		public void info() {
			
			super.info();
			System.out.println("Marine Info");
		}
		
		public Marine() {
			super(30);
			System.out.println("Marine 생성자");
			
		}
	   
	   
	}


