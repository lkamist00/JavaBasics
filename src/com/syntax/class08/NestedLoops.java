package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		//nested loop - loop inside a loop
		
		for(int i=1; i<3; i++) {				//outer loop controls the inner loop
			System.out.println("Hello");
				
			for(int j=1; j<=3; j++) {			//inner/nested loop, depends on outer loop
				System.out.println("Bye");
			}
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<=2; i++) {
			for(int j=1; j<4; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("---------------------");
		
	
		
	}

}
