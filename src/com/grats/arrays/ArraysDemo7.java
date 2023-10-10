package com.grats.arrays;

import java.util.Arrays;

public class ArraysDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		  
        // Get the second Array 
        int intArr1[] = { 10, 20, 15, 22,50  }; 
        
        if(intArr==intArr1) {
        	
        }
  
//        // To compare both arrays 
//        System.out.println("Integer Arrays on comparison: "
//                           + Arrays.equals(intArr, intArr1)); 
        
        int[] intArr3=Arrays.copyOf(intArr,2); //no of elements has to copy.
        System.out.println(Arrays.toString(intArr3));
        
	}

}
