package com.gang.zerg;

import com.gang.unit.Unit;

public class Hydra extends Unit {
	//hp, color, name
	//움직이고, 공격
		
	public Hydra(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("이동이동hydra");
	}
	
	public void attack() {
		System.out.println("공격공격공격hydra");
	}

}
