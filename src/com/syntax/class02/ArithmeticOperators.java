package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// +, -, *, /, %

		int a = 900;
		int b = 100;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println("------------------------------");

		int e = 10;
		int f = 5;

		System.out.println("division = " + e / f); // 2
		System.out.println("remainder = " + e % f); // 0

		System.out.println(20 % 4);
		System.out.println("------------------------------");

		int c = 10;
		int d = 3;

		int sum1 = c + d;
		int sum2 = c - d;
		int remainder = c % d; // 10%3= 1
		int div = c / d; // 10/3= 3

		System.out.println("Sum1 is = " + sum1);
		System.out.println("Sum 2 is = " + sum2);
		System.out.println("Remainder is = " + remainder);
		System.out.println("Division of integers is = " + div);

		double num1 = 10;
		double num2 = 3;

		System.out.println("Division of double is = " + num1 / num2); // when use division/ always use double"

		System.out.println("using float data type ----");

		float number1 = 10.0F;
		float number2 = 3.0F;

		System.out.println("Division of float is = " + number1 / number2);

		// remainder -%- mod operator

		System.out.println(6 % 3); // 6/3 = 2 + remainder 0
		System.out.println(6 % 4); // 6/4 = 1 + remainder 2

		System.out.println(10 + 10 / 10);
		System.out.println((10 + 10) / 10);

	}

}
