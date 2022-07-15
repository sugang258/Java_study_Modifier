package com.gang.unit;

public abstract class Unit {
//abstract 붙이면 Unit 객체 생성 불가
//Unit 이라는 것은 클래스 간의 공통 요소들이기 때문에 객체 생성을 하면 안됨
	
	   private int hp;
	   private String color;
	   private String name;
	   
	   public abstract void move();
	   
	   public void info() {
		   System.out.println("Super Info");
	   }
	   
	   public Unit(int hp) {
		   System.out.println("Super 생성자");
		   this.hp = hp;
	   }
		   
	  
	   
	   public int getHp() {
	      return hp;
	   }
	   public void setHp(int hp) {
	      this.hp = hp;
	   }
	   public String getColor() {
	      return color;
	   }
	   public void setColor(String color) {
	      this.color = color;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
}
	   

	


