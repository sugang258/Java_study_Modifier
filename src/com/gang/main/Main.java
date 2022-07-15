package com.gang.main;

import java.util.Scanner;

import com.gang.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3};
		
		//1.com.gang.util.CollectionStack 클래스 생성
			//add - 입력받은 새로운 숫자 추가 무조건 0번 인덱스에 추가
			//remove - 0번 인덱스 삭제
		
		//2.com.gang.util.CollectionQue
			//add - 입력받은 새로운 숫자 추가 무조건 0번 인덱스에 추가
			//remove - 마지막 인덱스 번호 삭제

		//3.com.gang.util.CollectionSet
			//add - 새로운 숫자 추가 마지막에 추가
			//	단, 중복되지 않는 숫자만 추가
			//remove - 삭제 할 숫자를 입력받아서 일치하는 숫자 삭제
		
		CollectionStack stack = new CollectionStack();
		stack.add(numbers);
		

	}

}
