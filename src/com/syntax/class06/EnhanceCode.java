package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {
		/*Scanner input=new Scanner(System.in);
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
		}*/
	    System.out.println("--------------------------------------");
	    
	    Scanner input=new Scanner(System.in);
		System.out.println("What time it is? Please use 24 hour format.");
	    int time=input.nextInt();
	    String timeOfTheDay = null;
	    
	    if((time>=1) && (time<=11)) {
	    	timeOfTheDay="It's morning";
		}else if(time>=12 && time<=1) {
			timeOfTheDay="It's afternoon";
		}else if(time>=16 && time<=20) {
			timeOfTheDay="It's evening";
		}else if(time>=21 && time<=24) {
			timeOfTheDay="It's night";
		}else {
			System.out.println("Invalid number");
			timeOfTheDay="Invalid";
		}
	    System.out.println(timeOfTheDay);
		
		
		
		
		
		
		
	}

}
