package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve your Repl assignments, please enter true or false");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if(solvedAnyRepls) {
			System.out.println("How many Repls you solved");
			int noOfReplsSolved=scanner.nextInt();
			
			if(noOfReplsSolved>=17) {
				System.out.println("You can move forward with next class");
			}else if(noOfReplsSolved>10) {
				System.out.println("Please complete them as soon as possible");
			}else {
				System.out.println("Please solve them before moving forward");
			}
			
		} else {
			System.out.println("Please solve them before moving forward");
		}

	}

}
