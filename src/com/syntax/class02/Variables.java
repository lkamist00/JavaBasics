package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Ted";
		String lastname = "Smith";
		char grade = 'A';
		String city = "Miami";
		String state = "Florida";
		String phonenumber = "555 555 555";

		System.out.println("My name is " + name + " and my lastname is " + lastname + ".");
		System.out.println("I am " + grade + " student.");
		System.out.println("I live in " + city + "," + state + ".");
		System.out.println("And my phone number is " + phonenumber + ".");

		city = "San Francisco";
		state = "California";
		grade = 'B';
		phonenumber = "777 777 7777";

		System.out.println();
		System.out.println("My name is " + name + " and my lastname is " + lastname + " and I moved in " + city + ","
				+ state + " last month.");
		System.out.println("I am a " + grade + " student.");
		System.out.println("My new phone number is " + phonenumber + ".");

		// rules for identifiers=names for (variables,methods, classes)
		// 1. cant use keywords as identifiers
		// String new="Hello"; ->error

		// 2. cannot have spaces in identifiers

		// 3. identifiers cant start with numbers

		// 4. identifiers cant contain any special characters except $ and _

		/*
		 * Naming conventions -Class start with Uppercase and follow camel casing
		 * -variables should start with lowercase and follow camel casing
		 * 
		 * Spring Weather="hot"; //not preferred Spring myWeather="cold"; //industry
		 * practice
		 */

	}

}
