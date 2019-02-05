package com.DataEnacapsulation;

//Java program to demonstrate encapsulation 
public class Employee {
	// private variables declared these can only be accessed by public methods of
	// class
	private String empName;
	private int empId;
	private int empSal;

	// get method for sal to access private variable empSal
	public int getSal() {
		return empSal;
	}

	// get method for name to access private variable empName
	public String getName() {
		return empName;
	}

	// get method for Id to access private variable empId
	public int getId() {
		return empId;
	}

	// set method for Sal to access private variable empSal
	public void setSal(int newSal) {
		empSal = newSal;
	}

	// set method for name to access private variable empName
	public void setName(String newName) {
		empName = newName;
	}

	// set method for Id to access private variable empId
	public void setId(int newId) {
		empId = newId;
	}
}
