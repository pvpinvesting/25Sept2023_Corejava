package com.grats.arrays;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void reverse(int[] numbers) {
	    for (int i = 0; i < numbers.length / 2; i++) {
	        int temp = numbers[i];
	        numbers[i] = numbers[numbers.length - 1 - i];
	        numbers[numbers.length - 1 - i] = temp;    
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {11, 42, -5, 27, 0, 89, 90};
		reverse(numbers);
		
		System.out.println(Arrays.toString(numbers));

	}

}
