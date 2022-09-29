package com.syntax.class08;

public class ContinueKeyWord {
	
	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			if(i==3) {
			continue; //it causes the loop to imidietly jump to next iterarion
			}
			System.out.println("Hello");
		}
		
		//i want to print numbers from 1-20 except numbers 3,7,11
		for(int i=1; i<=20; i++) {
			
			if(i==3 || i==7 || i==11) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		for(int i=1; i<=50; i++) {
			if(i%3 ==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
		
	}

}
