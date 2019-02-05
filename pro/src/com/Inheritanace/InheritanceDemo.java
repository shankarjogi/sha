package com.Inheritanace;

class Calculator {
	public int add(int i, int j) {
		return i + j;
	}
}

class AdvanceCal extends Calculator {
	public int sub(int i, int j) {
		return i - j;
	}
}

class VeryAdvanceCal extends AdvanceCal {
	public int mul(int i, int j) {
		return i * j;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {

		VeryAdvanceCal c1 = new VeryAdvanceCal();

		int result = c1.add(5, 5);
		int result1 = c1.sub(5, 5);
		int result2 = c1.mul(5, 5);
		System.out.println("Addition of 2 numbers is:" + result);
		System.out.println("substraction of 2 numbers is:" + result1);
		System.out.println("multiplication of 2 numbers is:" + result2);

	}
}
