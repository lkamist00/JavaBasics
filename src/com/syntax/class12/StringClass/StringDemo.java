package com.syntax.class12.StringClass;

public class StringDemo {

	public static void main(String[] args) {
		//Proper way of creating an object
		String str= new String("Java ");
		
		//Simpler and shorter way creating an object by Java
		String name="Alexander the Great ";//Only works for String and Wrapper classes
		//Count the number of characters in String, including empty spaces
		
		System.out.println(str.length());
		System.out.println(name.length());
		
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
