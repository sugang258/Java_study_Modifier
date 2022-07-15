package com.gang.util;

import java.util.Scanner;

public class CollectionStack implements Collection {
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	

	@Override
	public int[] add(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("추가할 값을 입력하세요");
		num = sc.nextInt();
		
		numbers[numbers.length] = numbers[numbers.length+1];
		
		if(numbers != null) {
			
			
		for(int i=0 ;i < numbers.length+1;i++) {
			
			numbers[i] = numbers[i+1];
			
		}
		}
		numbers[0] = num;
		
		return numbers;
	}

	@Override
	public int[] remove(int[] numbers) {
		// TODO Auto-generated method stub
		if(numbers != null) {
			
		}
		
		
		return null;
	}

}
