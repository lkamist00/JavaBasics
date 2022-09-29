package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {

		// String concatenation helps us combine a Spring with any primitive data type
		// together

		String firstName = "Mina ";
		String lastName = "Henen ";
		String fullName = firstName + lastName;
		System.out.println(fullName);

		int houseNo = 10;
		int apartmentNo = 5;
		String streetName = "123 Main street";
		String city = "West Palm Beach";
		String state = "33405, Florida";
		String fullAddress = houseNo + " " + apartmentNo + " " + streetName + " " + city + " " + state;

		System.out.println(fullAddress);

	}

}
