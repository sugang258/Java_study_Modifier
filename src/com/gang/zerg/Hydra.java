package com.gang.zerg;

import com.gang.unit.Attacker;
import com.gang.unit.Unit;

public class Hydra extends Unit implements Attacker {
	//hp, color, name
	//움직이고, 공격
		

	public Hydra() {
		// TODO Auto-generated constructor stub
		super(30);
	}
	

	public void move() {
		System.out.println("이동이동hydra");
	}
	
	
	public void attack() {
		System.out.println("공격공격공격hydra");
	}

}
