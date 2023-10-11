package com.grats.object;

public class EnhancedForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {24,345,4,2};
		for(int k=0;k<nums.length;k++) {
			System.out.println(nums[k]);
		}
		System.out.println("====================");
		int k=0;
		for(int num:nums) {
			System.out.println(k+":"+num);
			k++;
		}
		
		String names[] = new String[]{"User1","User2","User3","User4","User5"};
		for(String name:names) {
			System.out.println(name);
		}
		
	}

}
