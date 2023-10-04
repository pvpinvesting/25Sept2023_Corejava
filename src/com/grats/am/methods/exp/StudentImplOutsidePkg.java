package com.grats.am.methods.exp;

import com.grats.am.methods.Student;

public class StudentImplOutsidePkg extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentImplOutsidePkg std = new StudentImplOutsidePkg();
		std.printRollNo();
		std.printName();
//		std.printSubject();
//		std.printMarks();
	}

}
