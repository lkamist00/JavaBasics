package com.syntax.class03;

public class ifElse4 {

	public static void main(String[] args) {
		
		int number = 19;
		if (number != 18) {
			System.out.println("Use a number not higher than 18");
		}

		
		int day=10;
		if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("Thursday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day==6) {
			System.out.println("Saturday");
		}
		else if(day==7) {
			System.out.println("Sunday");
		}
	
		// use 'else if' when we need to specify multiple conditions 
		
		else {
			System.out.println("Please enter a valid day number 1-7");
		}

	}

}
