package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first name:");
		
		String firstName=input.next();
		System.out.println("Hello "+firstName+" ,welcome!");
		
		System.out.println("How old are you?");
		int age=input.nextInt();
		System.out.println(firstName+" is "+age+" years old.");
		
		System.out.println("How much money you have? "+firstName);
		double money=input.nextDouble();
		System.out.println(firstName+" has "+money+" $.");
		
		System.out.println(firstName+" what is your grade?");
		char grade=input.next().charAt(0);
		System.out.println(firstName+" has grade "+grade+".");
		
		System.out.println("Please enter another name:");
		firstName=input.next();
		System.out.println("New name is "+firstName);
	}

}
