package com.grats.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charArr = {'G','r','a','t','s'};
		String str=new String(charArr);
		System.out.println(":str:"+str);
		System.out.println(str.charAt(3));

		String str1="Sachin";
		System.out.println(str1.charAt(2));
		String str2=new String("Sachin");
//		System.out.print(str1.hashCode()+" "+str2.hashCode()); 
//		System.out.println(str1==str2);
		String str3="sachin";
//		System.out.print(str1.hashCode()+" "+str3.hashCode()); 
//		System.out.println(str1==str3);
		String str4="Sachin";
//		System.out.print(str1.hashCode()+" "+str4.hashCode()); 
//		System.out.println(str1==str4);
		String str5=new String("   Sachin");
		System.out.println(str2==str5);
		
		System.out.println(str2.equals(str5));
		System.out.println(str3.equals(str5));
		System.out.println(str3.equalsIgnoreCase(str5));
		
		

	}

}
