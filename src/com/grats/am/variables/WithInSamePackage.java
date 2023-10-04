package com.grats.am.variables;

public class WithInSamePackage {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession);
//		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession+":city:"+emp.city);
		emp.id=1002;
		emp.name="Shehwag";
		emp.profession="Cricket";
//		emp.city="Delhi";
		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession);
//		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession+":city:"+emp.city);
	}

}
