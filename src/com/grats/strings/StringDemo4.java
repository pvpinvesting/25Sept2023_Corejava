package com.grats.strings;

public class StringDemo4 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String name="Sachin ";
//		String fullName=name+"Tendulkar";
//		System.out.println(":name:"+name);
//		System.out.println(":fullName:"+fullName);
//		String fname=name.concat("Tendulkar");
//		System.out.println(":name:"+name);
//		System.out.println(":fname:"+fname);
//		
//		String name2="Sachin Tendulkar";
//		String lName=name2.substring(7,10);
//		System.out.println(":lName:"+lName);
//		
//		System.out.println(name.toUpperCase());
//		System.out.println(fullName.toLowerCase());
//		System.out.println(name2.startsWith("Sachinfdgdfs"));
		
//		String filename="abasdf.asdfcd.json";
//		System.out.println(filename.endsWith(".csv"));
//		String extension = filename.substring(filename.lastIndexOf("."));
//		System.out.println(extension);
//		String csvFile=filename.replace(".json",".csv");
//		System.out.println(csvFile);
//		
//		String name="   Sachin    ";
//		System.out.println(name.trim());
		
		String sentence=new String("Hi how are you");
		
		//you are how Hi
		
		String[] strArr=sentence.split(" ");
////		for(String str:strArr) {
////			System.out.println(str);
////		}
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i]);
//		}
//		
		for(int i=strArr.length-1;i>=0;i--) {
			System.out.print(strArr[i]+" ");
		}
		
		String filename="abasdf.asdfcd.json";
		System.out.println(filename.endsWith(".csv"));
		int  indx = filename.lastIndexOf(".");
		System.out.println(indx);
		
	}

}
