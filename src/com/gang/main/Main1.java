package com.gang.main;

import com.gang.terran.Marine;
import com.gang.terran.Race;
import com.gang.terran.Scv;
import com.gang.unit.Unit;
import com.gang.zerg.Hydra;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		Race r1 = new Race();
		m1.setHp(30);
		m1.info();
		
		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		
		m1 = (Marine) unit;

		System.out.println(m1.getWeapon());
		
		Unit unit1 = r1;
		
		Hydra hydra = new Hydra();
		
		m1.attack();
		hydra.attack();
		
			
		
		
		

	}

}
