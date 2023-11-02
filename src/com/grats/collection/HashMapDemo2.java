package com.grats.collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hashMapObj=new HashMap<>();
		hashMapObj.put("1001", "TCS");
		hashMapObj.put("456", "Wipro");
		hashMapObj.put("674", "HCL");
		hashMapObj.put("434", "Grats");
		hashMapObj.put("3443", "Accenture");
		hashMapObj.put("3454", "JKT");
		String compName=hashMapObj.get(434);
		System.out.println(":compName:"+compName);
		System.out.println(":hashMapObj:"+hashMapObj);
		
		Set<String> keys=hashMapObj.keySet();
		System.out.println(":keys:"+keys);
		for(String key:keys) {
			System.out.println(":key:"+key+":value:"+hashMapObj.get(key));
		}
		
		System.out.println(":===========================================>:");
		Set<Entry<String,String>> entrySet=hashMapObj.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(":key:"+entry.getKey()+":value:"+entry.getValue());
		}
	}

}
