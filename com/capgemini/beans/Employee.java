package com.capgemini.beans;

public class Employee {
	public Employee(int id, String name, Address addressLine2) {
		// TODO Auto-generated constructor stub
	}
	
	private String empName;
	private Address addressLine;
	private int  id;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(Address addressLine) {
		this.addressLine = addressLine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return " id=" + id + ", empName=" + empName + ", addressLine=" + addressLine ;
	}
	
}
