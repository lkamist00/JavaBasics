package com.syntax.class12.StringClass;

public class StringDemo5 {
	
	public static void main(String[] args) {
	
		String str="I love options writing";
		
		System.out.println(str.charAt(2));//prints the character with index 2
		
		//charAt returns us the character at a specific index
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)==' ')) { 			//print only characters, ignores empty spaces in string
				System.out.print(str.charAt(i));	
			}
			
		}
		
		
		
		
	}
	
}
