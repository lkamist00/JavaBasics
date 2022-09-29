package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		/*Loops are general concept that ables you to run same code multiple times
		 *	1.While loop - infinite loop
			2.Do while loop
			3.For loop
			4.Enhanced for loop/for each loop/advanced for loop
			
			While vs do while --> both loops execute while condition is true:
			-while loop first CHECKS condition -> if true -> executes code
			-do while loop EXECUTE code --> Checks if condition is true
			
			When to use which loop:
			-when we know in advance how many times to repeat block of code 		--> USE FOR LOOP
			-when we dont know in advance how many times to repeat block of code	--> USE WHILE or DO WHILE
					
					
			*/
		
		int time=10;
		
		if(time<12) { //true and print 
			System.out.println("Good morning inside if statement"); 
		}
		
		/*
		while(time<12) {
			System.out.println("Good morning");	- infinite loop
		}*/ 
		
		while(time<12) { //10<12 true and print
			System.out.println("Good morning inside while loop");
			time++; //10+1<11 true and print    11+1<12 false and stop printing
		}
		
		
		
		
		
		
		

	}

}
