package com.grats.arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] studentArray=new Student[5];
		
//		for(int i=0;i<studentArray.length;i++) {
//			System.out.println(studentArray[i]);
//		}
		
		Student std1=new Student(2001,"Student-1","Bangalore",new double[] {60,77,65,58,60,90});
		studentArray[0]=std1;
//		
		studentArray[1]=new Student(2002,"Student-2","Hyderabad",new double[] {75,98,78,90,56,66});
//		
		studentArray[2]=new Student();
//		
		Student std3=studentArray[2];
		std3.setRollNo(2003);
		std3.setAddress("Chennai");
		std3.setName("Student-3");
		std3.setMarks(new double[] {98,96,65,54,56,87});
//		
		studentArray[3]=new Student();
		studentArray[3].setRollNo(2004);
		studentArray[3].setName("Student-4");
		studentArray[3].setAddress("Hyderabad");
		studentArray[3].setMarks(new double[] {98,96,65,54,56,87});
//		
		studentArray[4]=new Student(2005,"Student-5","Bangalore",new double[] {75,98,78,90,56,66});
//		
		for(int i=0;i<studentArray.length;i++) {
			Student std=studentArray[i];
			System.out.println(std.getRollNo()+" "+std.getName()+" "+std.getAddress()+" "
			+std.getMarks()[0]+" "+std.getMarks()[1]+" "+std.getMarks()[2]+" "+std.getMarks()[3]+" "+std.getMarks()[4]+" "+std.getMarks()[5]);
		}
		
	}

}
