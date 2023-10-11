package com.grats.object;

public class ToStringDemo1 {
	
	String name="Grats";
	int id=1001;
	
	@Override
	public String toString() {
		return "ToStringDemo1 [name=" + name + "]"+" [id="+id+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToStringDemo1 obj=new ToStringDemo1();
		System.out.println(obj);
//		System.out.println(obj.toString());
		
		String str=new String("Grats");
		System.out.println(str);
		
	}

}
