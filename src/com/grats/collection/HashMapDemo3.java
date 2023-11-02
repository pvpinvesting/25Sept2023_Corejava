package com.grats.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Company> hashMapObj=new HashMap<>();
		hashMapObj.put("1001", new Company(1001,"TCS","Bangalore"));
		hashMapObj.put("456", new Company(456,"Wipro","Bangalore"));
		hashMapObj.put("674", new Company(674,"HCL","Bangalore"));
		hashMapObj.put("434", new Company(434,"Grats","Bangalore"));
		hashMapObj.put("3443", new Company(3443,"Accenture","Bangalore"));
		hashMapObj.put("3454", new Company(1001,"JKT","Bangalore"));
		
		Company company=hashMapObj.get("434");
		System.out.println(":company:"+company);
		System.out.println(":compId:"+company.getCompId()+":name:"+company.getCompName()+":addresss:"+company.getAddress());
		
		
//		System.out.println(":hashMapObj:"+hashMapObj);
//		
		Set<String> keys=hashMapObj.keySet();
//		System.out.println(":keys:"+keys);
		for(String key:keys) {
			Company comp=hashMapObj.get(key);
			System.out.println(":compId:"+comp.getCompId()+":name:"+comp.getCompName()+":addresss:"+comp.getAddress());
		}
//		
//		System.out.println(":===========================================>:");
//		Set<Entry<String,String>> entrySet=hashMapObj.entrySet();
//		for(Entry<String,String> entry:entrySet) {
//			System.out.println(":key:"+entry.getKey()+":value:"+entry.getValue());
//		}
		
		
		//Employee ( empId,empName,sal,compCode)
		//List<>
		
		
	}

}
