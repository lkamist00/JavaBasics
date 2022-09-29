package com.syntax.class12.StringClass;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Tashak";
		String lastName="Tashakov";
		System.out.println(firstName+lastName);//mostly used
		System.out.println(firstName.concat(lastName));
		
		String str="";
		System.out.println(str.isEmpty()); //isEmpty() is boolean, returns true if String is empty, false if at least 1 character
		//System.out.println(str.isBlank()); //isBlank does not count the spaces
		

	}

}
