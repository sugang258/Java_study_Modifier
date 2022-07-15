package com.gang.ex1;

public class Iu {
	
	private String name;
	private int age;
	
	private String test;
	
	private static Iu iu = null;
	//
	private  Iu() {
		
	}
	
	public static Iu getInstance() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//setter
	//public void set변수명(데이터타입 변수명) {}
	
	//getter
	//public 리턴타입 get변수명() {}

}

/*
 * public class Super() {
 * 		public abstract void t1();
 * }
 * 
 * public class Child extends Super() {
 * 		public void t1() {} //오버라이딩
 * 		public void t2() {} //선언
 * 		public void t1(int i) {} //오버로딩
 * 		public void t1() {} //중복선언
 */
