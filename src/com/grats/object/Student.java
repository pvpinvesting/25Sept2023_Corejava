package com.grats.object;

public class Student implements Cloneable {
	private int id;
	private String name;
	private String address;
	public Student() {
		super();

	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Student std=(Student)obj;
		if(this.getId()==std.getId()&&this.getName().equals(std.getName())&&this.getAddress().equals(std.getAddress())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int hashCode() {
		int results=17;
		results = 31 * results + this.id;
		results = 31 * results + this.name.hashCode();
		results = 31 * results + this.address.hashCode();
		return results;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
