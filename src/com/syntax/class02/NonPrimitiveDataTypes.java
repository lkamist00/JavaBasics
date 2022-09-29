package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {

		// String - a value thats represented in "", 1 exapmple of nonprimitive data
		// type
		// variables start with capital letter, cant create class String

		String name = "Teddy";

		String address = "123 Main street";

		// int phonenumber=561123121;

		String phonenumber = "561 555 5555";

		// String age="17";
		int age = 17;
		// arithmetic operations work only with int, integer

		// syso+ctrl+space -> auto completed System.out.prinln()
		System.out.println(name);

		// "My name is" + Teddy //to combine two Strings, to combine String to int ust +
		System.out.println("My name is " + name);

		// Teddy is 17
		System.out.println(name + " is " + age);

		System.out.println(address);
		System.out.println(phonenumber);
		System.out.println(age);

		/*
		 * to attach any value (int,double,boolean, char,) to a String we use the + sign
		 * +next to the String acts as Concatenation
		 */

		String fruit = "apple";
		double price = 1.99;
		char dollarsign = '$';
		// The price of the apple is 1.99
		System.out.println("The price of the " + fruit + " is " + dollarsign + price);

		// The price of mango is 4.99
		fruit = "mango";
		price = 4.99;
		System.out.println("The price of the " + fruit + " is " + dollarsign + price);
		System.out.println("The price of the " + fruit + " is $" + price);

	}

}
