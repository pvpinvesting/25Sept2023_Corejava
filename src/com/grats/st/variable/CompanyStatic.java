package com.grats.st.variable;

public class CompanyStatic {

	public String name;
	public String address;
	
	static {
		System.out.println("Company class static block");
	}
}
