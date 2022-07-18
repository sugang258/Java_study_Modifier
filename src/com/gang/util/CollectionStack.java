package com.gang.util;

import java.util.Scanner;

public class CollectionStack implements Collection {
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int [] nums;
	

	@Override
	public int[] add(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("추가할 값을 입력하세요");
		num = sc.nextInt();
		nums = new int[numbers.length+1];
		
			nums[0] = num;
			
			for(int i=0;i<numbers.length ;i++) {
				nums[i+1] = numbers[i]; 
			}
		
		
		return nums;
	}
	

	@Override
	public int[] remove(int[] numbers) {
		// TODO Auto-generated method stub
		if(numbers != null) {
			
		}
		
		
		return null;
	}

}
