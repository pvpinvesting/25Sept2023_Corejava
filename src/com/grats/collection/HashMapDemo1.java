package com.grats.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashMapObj=new HashMap<>();
		hashMapObj.put(1001, "TCS");
		hashMapObj.put(456, "Wipro");
		hashMapObj.put(674, "HCL");
		hashMapObj.put(434, "Grats");
		hashMapObj.put(3443, "Accenture");
		hashMapObj.put(3454, "JKT");
		hashMapObj.put(2424, null);
		hashMapObj.put(234, null);
		hashMapObj.put(455, null);
		hashMapObj.put(323, null);
		
		String compName=hashMapObj.get(434);
		System.out.println(":compName:"+compName);
		System.out.println(":hashMapObj:"+hashMapObj);
		
		Set<Integer> keys=hashMapObj.keySet();
		System.out.println(":keys:"+keys);
		for(Integer key:keys) {
			System.out.println(":key:"+key+":value:"+hashMapObj.get(key));
		}
		
		System.out.println(":===========================================>:");
		Set<Entry<Integer,String>> entrySet=hashMapObj.entrySet();
		for(Entry<Integer,String> entry:entrySet) {
			System.out.println(":key:"+entry.getKey()+":value:"+entry.getValue());
		}
		
		
	}

}
