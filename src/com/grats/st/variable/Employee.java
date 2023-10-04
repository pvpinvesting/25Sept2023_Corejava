package com.grats.st.variable;

public class Employee {
	
	public int id;
	public String name;
	public String desg;
	public static String company;
	public String department;
	
	Employee(){
		this.department="SALE";
		System.out.println("Inside constructor");
	}
	
	public void show() {
		System.out.println(""+id+":"+name+":"+desg+":"+company);
	}
	
	public static void display(Employee emp) {
		System.out.println("Statick method");
		System.out.println(""+emp.id+":"+emp.name+":"+emp.desg+":"+company);
	}
	
	static {
		Employee.company="Infosys";
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside instance block");
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub\
		
		Employee e1=new Employee();
//		e1.id=1001;
//		e1.name="Vivek";
//		e1.desg="Manager";
////		e1.company="Grats";
//		
		Employee e2=new Employee();
//		e2.id=1002;
//		e2.name="Srinivas";
//		e2.desg="Developer";
////		e2.company="Grats";
//		
//		Employee.company="Accenture";
//		
//		Employee.display(e1);
//		Employee.display(e2);
//		e1.show();e2.show();
		
//		Class.forName("com.grats.st.variable.Company");

	}

}
