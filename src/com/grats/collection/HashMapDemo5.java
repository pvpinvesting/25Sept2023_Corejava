package com.grats.collection;

import java.util.HashMap;

public class HashMapDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hashMapObj=new HashMap<>();
		hashMapObj.put("434", "Grats");
		hashMapObj.put("674", "HCL");
		hashMapObj.put("532", "TCS");
		hashMapObj.put("456", "Wipro");
		hashMapObj.put("23", "Accenture");
		hashMapObj.put("3454", "JKT");
		
		Boolean flag=hashMapObj.containsKey("4645654");
		System.out.println(":flag:"+flag);
		
		Boolean flag2=hashMapObj.containsValue("fadsffsaddf");
		System.out.println(":flag2:"+flag2);
		
//		hashMapObj.clear();
		Boolean flag3=hashMapObj.isEmpty();
		System.out.println(":flag3:"+flag3);
		
		System.out.println(":hashMapObj:"+hashMapObj);
		
		hashMapObj.put("1001", "CTS");
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.remove("1001");
		System.out.println(":hashMapObj:"+hashMapObj);
		
		hashMapObj.put(null, null);
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.put(null, "Default");
		System.out.println(":hashMapObj:"+hashMapObj);
		hashMapObj.put("1001",null);
		hashMapObj.put("1009",null);
		System.out.println(":hashMapObj:"+hashMapObj);
		
	}

}
