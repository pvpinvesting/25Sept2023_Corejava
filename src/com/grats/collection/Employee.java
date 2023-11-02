package com.grats.collection;

public class Employee {

	private int empId;
	private String empName;
	private double sal;
	private String compCode;
	
	public Employee(int empId, String empName, double sal, String compCode) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.compCode = compCode;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", compCode=" + compCode + "]";
	}
}
