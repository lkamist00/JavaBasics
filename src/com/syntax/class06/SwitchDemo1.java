package com.syntax.class06;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		/*SWITCH SYNTAX						-Switch statement is value based, it knows the value->jumps into matching case
		 * switch(variable){				-If statement is condition based, it checks which condition is true
		 * case value1:						-Variable and case need to be same data type
		 * 		code A;
		 * 		break;
		 * case value2;
		 * 		code B;
		 * 		break;
		 * default:
		 * 		code C;
		 * 		break;
		 * */
		
		/*Limititations of SWITCH CASE
		 * switch case can't use logical operators &&, ||, !
		 * switch case can't use relational operators
		 * 
		 * CAN'T work with boolean values
		 * CAN'T work with float/double and long
		 */

		int day = 8;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Please enter a valid day number 1-7");
		}
		System.out.println("--------------------------------");

		String name;
		switch (day) {
		case 1:
			name = "Monday";
			break;
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:
			name = "Invalid";
			break;	
		}
		System.out.println("Invalid");
		
		
	}
}
