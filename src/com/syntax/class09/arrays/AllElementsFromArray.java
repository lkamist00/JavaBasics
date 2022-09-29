package com.syntax.class09.arrays;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		String[] iceCream= {"vanilla","chocolate","pistachio","almond",};
		
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		
		System.out.println("------------------------");
		
		//how to get all the values?
		for(int i=0; i<iceCream.length; i++) {
			System.out.println(iceCream[i]);
		}
		
		
		System.out.println("------------------------");
		
		char[] letters= {'A','B','C','D'};
		for(int i=0; i<letters.length; i++) {
			System.out.print(letters[i]+" ");
		}

		
		
		
	}

}
