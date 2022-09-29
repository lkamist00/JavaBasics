package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
	
		for(int i=1; i<5; i++) {		
			System.out.println("Hello");		
			if(i==2) {
			break; //breaks and stops the loop and is usually used inside some type of condition
			}
		}
		System.out.println("End");
			
		boolean hungry=true;
		
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
		
		

	}

}
