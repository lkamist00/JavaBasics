package com.syntax.class07;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		/*SYNTAX
		 * do {
		 * 		code to be repeated;
		 * }while(boolean condition);
		 * 
		 */
		
		
		
		int num=1;
		
		while(num>=3) {
			System.out.println("I am while loop");
			num++;
		}
		System.out.println("---------------------------");
		
		int num1=1;
		do {
			System.out.println("I am do while loop");
			num1++;
		}while(num1<=2);
		
		

	}

}
