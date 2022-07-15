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
		   
		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
	   
	   
	}


