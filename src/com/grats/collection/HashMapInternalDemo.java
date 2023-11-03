package com.grats.collection;

import java.util.HashMap;

public class HashMapInternalDemo {

	public static void calculateIndex(String str) {
		
		int hashcode=str.hashCode();
		int n=16;
		int index = hashcode & (n-1);
		System.out.println(":hashcode:"+hashcode+":index:"+index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hashMapObj=new HashMap<>();
		hashMapObj.put("Grats", "1001");
		hashMapObj.put("HCL", "1002");
		hashMapObj.put("Exilant", "1002");
		
//		hashMapObj.put("TCS", "1003");
//		hashMapObj.put("Wipro", "1004");
//		hashMapObj.put("Accenture", "1005");
//		hashMapObj.put("JKT", "1006");
//		hashMapObj.put("Infosys", "1007");
//		hashMapObj.put("AWB", "1008");
//		hashMapObj.put("SAP", "1009");
		
//		calculateIndex("Grats"); //:hashcode:69063093:index:5
//		calculateIndex("HCL"); //:hashcode:71345:index:1
		calculateIndex("Exilant"); //:hashcode:349026545:index:1
		
//		hashMapObj.get("Exilant");
	}

}
