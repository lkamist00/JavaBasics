package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {

		/*
		 * Compiler always checks code before giving it to java to execute it Compiler
		 * can initialize variables to its default values int=0; double=0.0;
		 * boolean=false; String and other non primitive=null;
		 */

		int n1 = 100;
		int n2 = 2000;
		int n3 = 30000;
		int largest = 0;

		if (n1 > n2 && n1 > n3) {
			largest = n1; // System.out.println(n1+" is the largest.");

		} else if (n2 > n1 && n2 > n3) {
			largest = n2; // System.out.println(n2+" is the largest.");

		} else if (n3 > n1 && n3 > n2) {
			largest = n3; // System.out.println(n3+" is the largest.");
		}

		System.out.println(largest + " is the largest number");
		
		if(largest!=0) {
			if (largest % 2 == 0) {
			System.out.println(largest + " is even number");
			} else {
			System.out.println(largest + " is odd number");
			}
		}
		
		 
		
	}
}
