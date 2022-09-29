package com.syntax.class06;

public class LogicalNot {
	
	public static void main (String[] args) {
		
		//Logical operator NOT, !
		
		boolean boo=!true; 		//not true is false
		System.out.println(boo);
		
		boolean boo1=!false;	//not false is true
		System.out.println(boo1);
		
		
		boolean rain=false;
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day="Monday";
		if(!day.equals("Sunday")) {
			System.out.println("Today is not Sunday");
		}
		System.out.println("---------------------------");
		
		boolean checkBoxSelected=false;
		if(!checkBoxSelected) {
			System.out.println("I will click and select it");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
