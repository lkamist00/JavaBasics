package homework;

import java.util.Scanner;

public class LogicalOperatorsHW {

	public static void main(String[] args) {
		/*HW: 1. Write a program that will ask user to input inputs the current time (use 24 hour format).
		Based on the given time define:
		if hour is between 1-11 --> Morning
		if hour between 12-15 --> Afternoon
		if hour between 16-20 --> Evening
		if hour between 21-24 --> Night*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("What time it is? Please use 24 hour format.");
	    int time=input.nextInt();
		
		if((time>=1) && (time<=11)) {
			System.out.println("It's morning");
		}else if((time>=12) && (time<=15)) {
			System.out.println("It's afternoon");
		}else if((time>=16) && (time<=20)) {
			System.out.println("It's evening");
		}else if((time>=21) && (time<=24)) {
			System.out.println("It's night");
		}else {
			System.out.println("Invalid number");
		}
		
		/*2. Write a program for user to enter his/hers birth month. Based on the month define the season.
		Example: if user is born in March, April, May → season =”Spring” 
		if user is born in June, July, August → 
		season =”Summer”  etc …*/
		
		System.out.println("Please enter your birth month:");
		String month=input.next();
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("Winter");
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("Spring");
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("Summer");
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("Autumn");
		}else {
			System.out.println("Invalid month");
		}
			
			
	}

}
