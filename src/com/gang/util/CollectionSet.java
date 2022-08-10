package com.gang.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int [] nums;

	@Override
	public int[] add(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("추가할 숫자를 입력하세요");
		num = sc.nextInt();
		nums = new int[numbers.length+1];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == num) {
				System.out.println("중복되는 값이 있습니다.");
				break;
			}
		}
		nums[nums.length] = num;
		
		for(int i =0; i<numbers.length;i++) {
			nums[i] = numbers[i];
		}
		
		
		
		return nums;
	}

	@Override
	public int[] remove(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 숫자를 입력하세요");
		num = sc.nextInt();
		
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == num) {
				nums = new int[numbers.length-1];
				for(int index = 0; index < i; index++) {
					nums[index] = numbers[index];
				}
				for(int j = i; j < numbers.length-1; j++) {
					nums[j] = numbers[j+1];
				}
				break;	
			}else {
				System.out.println("일치하는 숫자가 없습니다.");
			}
		}
		
		return nums;
	}

}
