package com.gang.main;

import com.gang.animal.Cat;
import com.gang.animal.Human;
import com.gang.animal.Zoo;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat cat = new Cat();
		//cat.sound();
		//cat.age = 5;
		
		Human human = new Human();
		//human.age = 500;
		human.setAge(200);
		human.info();
		//--------------------------
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
		//zoo.price = 10000;

	}

}
