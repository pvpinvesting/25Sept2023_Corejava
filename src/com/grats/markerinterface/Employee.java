package com.grats.markerinterface;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3953266881613436470L;
	

	private static final String COMPANY_NAME="Grats";
	
	private int empId;
	private String empName;
	private String address;
	private transient String compCode;
	
	public Employee(int empId, String empName, String address,String compCode) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", compCode=" + compCode
				+ "]";
	}
}
