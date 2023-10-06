package com.grats.strings;

public class StringDemo2 {
	
	public void printLength(String str) {
		System.out.println(str+" length is: "+str.length());
	}
	
	public void printSubstring(String str) {
		String subStr=str.substring(6);
		System.out.println(subStr);
	}
	
	public void emptyCheck(String str) {
		if(str!=null && str.isEmpty()) {
			System.out.println("empty string");
		}else {
			System.out.println("not empty string");
		}
//		if("".isEmpty()) {
//			System.out.println("empty string");
//		}else {
//			System.out.println("not empty string");
//		}
		
	}

	public void compareToStrings(String str1,String str2) {
		int num=str1.compareTo(str2);
		System.out.println(num);
		int num1=str2.compareTo(str1);
		System.out.println(num1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2 obj1=new StringDemo2();
//		obj1.printLength("Grats");
//		obj1.printSubstring("Grats IT Services");
//		obj1.printSubstring("Grats IT Services");
//		obj1.compareToStrings("Hello", "Follow");
		
//		String str1="Grats";
//		System.out.println("::"+str1.charAt(2));
		obj1.emptyCheck(null);
	}

}
