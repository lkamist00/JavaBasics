package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
	
		/*we need to ask a user where he/she is from
		 * based on the country we need to define favourite food 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=input.nextLine();
		String favouriteFood;
		
		switch(country) {
		
		case "USA":
			favouriteFood="Steak";
			break;
		case "Mexico":
			favouriteFood="Taco";
			break;
		case "China":
			favouriteFood="Rice";
			break;
		default:
			favouriteFood="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and your favourite food is "+favouriteFood);
		
	}

}
