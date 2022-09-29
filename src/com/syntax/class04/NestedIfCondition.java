package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		
		
		int time=9;
		String day="Monday";
		/*if the outter condition is true, than only the inner conditions will be checked, 
		 * if the outter condition is false the inner wont even be open
		 */
		
		if(day.equals("Monday")) { 								//outer if condition
			//As String is non primitive we cant use == sign, instead we use .equals method
			
			if(time>7) {										//inner if condition
				System.out.println("Lets go to the office");	
			}
			if(time<6) {										//inner if condition
				System.out.println("Lets sleep more");
			}
		}
		
		
		
		
		
		
	}

}
