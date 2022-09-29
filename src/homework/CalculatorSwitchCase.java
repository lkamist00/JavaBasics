package homework;

import java.util.Scanner;

public class CalculatorSwitchCase {

	/*
	 * 3. : Using scanner class create calculator. Allow user to enter 2 numbers and
	 * operator(+,-,*,/). Based on operator provide the result to user. Please
	 * complete this assignment in 2 ways: using if statement and switch case.
	 */

	public static void main(String[] args) {

		char operator;
		int number1, number2, result = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number:");
		number1 = input.nextInt();

		System.out.println("Enter operator:");
		operator = input.next().charAt(0);

		System.out.println("Enter second number:");
		number2 = input.nextInt();

		switch (operator) {

		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '%':
			result = number1 % number2;
			break;
		default:
			System.out.println("Invalid");
		}

		System.out.println("The result is " + result);

	}
}
