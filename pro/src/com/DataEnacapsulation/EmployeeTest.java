package com.DataEnacapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee obj = new Employee();

		// setting values of the variables
		obj.setName("Harsh");
		obj.setSal(20000);
		obj.setId(51);

		// Displaying values of the variables
		System.out.println("Employee's name: " + obj.getName());
		System.out.println("Employee's salary: " + obj.getSal());
		System.out.println("employee's Id: " + obj.getId());

	}
}