package com.syntax.class09.arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//only when we deal with arrays or collections, java gives us the "for each" loop, enhanced for/advanced loop
		//only loops in one direction, can't start from the end
		
		String[] iceCream= {"vanilla","chocolate","pistachio","almond","mango"};
		
		for(String flavor:iceCream) {
			
			System.out.println(flavor);
		}
		System.out.println("------------------------");
		
		char[] letters= {'A','B','C','D'};
		
		for(char grade:letters) {
			System.out.print(grade+" ");
		}
		System.out.println("------------------------");
		
		//get all elements regular for loop
		
		int[] numbers= {12, 88, 894, 57, 6894};	
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("------------------------");
		//get all numbers with enhanced for loop
		
		//	int[] numbers= {12, 88, 894, 57, 6894};
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		
		
		
	}

}
