package com.syntax.class05;

import java.util.Scanner;

public class LogicalPractice {

	public static void main(String[] args) {

		/*
		 * 1. Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: • short (under 60 inch) • medium(between
		 * 60 -72 inch) • tall (over 72 inch)
		 * */

		System.out.println("What's your height?");
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		if (height < 60) {
			System.out.println("You are short.");
		}
		else if ((height >= 60) && (height < 72)) {
			System.out.println("You are medium.");
		}
		else if (height >= 72) {
			System.out.println("You are tall.");
		}
		System.out.println("-----------------------------------------");
		
		/*2. Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 * */

		System.out.println("What day it is?");
		int day = input.nextInt();
		if ((day >= 1) && (day <= 5)) {
			System.out.println("It's a weekday.");
		} else if ((day == 6) || (day == 7)) {
			System.out.println("It's a weekend.");
		} else {
			System.out.println("Invalid day.");
		}		
		System.out.println("-----------------------------------------");
		/*3. Ask user to enter a number and then define if number is small, medium or
		 * large Small number is value between 1 and 10 Medium number is value between
		 * 11 and 100 Large number is value between 101 and 1000
		 */
		
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		if ((num >= 1) && (num <= 10)) {
			System.out.println("This is a small number.");
		} else if ((num >= 11) && (num <= 100)) {
			System.out.println("This is a medium number.");
		} else if ((num >= 101) && (num <= 1000)) {
			System.out.println("This is a large number.");
		}

	}

}
