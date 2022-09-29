package com.syntax.class07;

import java.util.Scanner;

public class LoopsHW2 {

	public static void main(String[] args) {
		/*
		 * 6. Declare a variable to store a price for a coffee. Ask the user to pay for
		 * a coffee. Keep asking to pay for coffee until the user enters the EXACT
		 * amount . If the user gives more than coffee price --> ask them to give less,
		 * if the user gives less money then ask to give more. Once user give EXACT
		 * amount print “Please enjoy your coffee
		 */

		Scanner scan = new Scanner(System.in);
		double price = 4.99;
		double user;

		do {
			System.out.println("$4.99 please");
			user = scan.nextDouble();
			
				if (price > user) {
				System.out.println("You need to pay more");
				}else if (price < user) {
				System.out.println("You need to pay less");
				}

		} while (user != price);{
			System.out.println("Enjoy your coffee");
		}

		
		
		
		
		
		//
		
		
		
	}

}
