package homework;

import java.util.Scanner;

public class CalculatorIfElse {
	
	public static void main(String[] args) {
		
		/*3. :  Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1=input.nextInt();
		
		System.out.println("Enter operator:");
		char operator=input.next().charAt(0);
		
		System.out.println("Enter second number:");
		int num2=input.nextInt();
		
		double result=0;
		boolean wrongOperator=false;
		
		if(operator == '+') {
			result=num1+num2;
		}else if(operator == '-') {
			result=num1-num2;
		}else if(operator == '*') {
			result=num1*num2;
		}else if(operator == '/') {
			result=num1/num2;
		}else if(operator == '%') {
			result=num1%num2;
		}else {
			System.out.println("Enter valid operator");	
			wrongOperator=true;
		}
		
		if(!wrongOperator) {
		System.out.println(result);
		}
		
		
		
		
	}

}
