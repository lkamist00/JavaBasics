package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your birth month:");
		String month=input.next();
		String season = null;
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Autumn";
		}
		else {
			System.out.println("Invalid month");
		}
		System.out.println("You were born in season "+season);
		
	
		
		
		
	}

}
